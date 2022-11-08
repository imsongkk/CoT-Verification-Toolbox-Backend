#!/bin/bash

REPOSITORY=/home/ec2-user
PROJECT_NAME=CoTEVer-Server

cd $REPOSITORY/$PROJECT_NAME/

echo "> Git Pull"

git pull

./gradlew build

cd $REPOSITORY

cp $REPOSITORY/$PROJECT_NAME/build/libs/*.jar $REPOSITORY/

CURRENT_PID = $(pgrep -f ${PROJECT_NAME}.*.jar)

if [ -z "$CURRENT_PID" ]; then
	echo "> 현재 구동중인 서버가 없음"
else
	kill -15 $CURRENT_PID
	sleep 5
fi

JAR_NAME=$(ls -tr $REPOSITORY/ | grep jar | head -n 1)

nohup java -jar $REPOSITORY/$JAR_NAME 2>&1 &
