package com.example.CoTEVer.dto

import com.example.CoTEVer.entity.Log

data class ResultRequestDto(
    val query : String,
    val stepCount : Int,
    val finalAnswer : String,
    val finalAnswerRating : Int,
    val finalExplanation : String,
    val nodeList: List<ResultNode>
) {
    companion object{
        fun toLog(resultRequestDto: ResultRequestDto) : Log{
            return Log(
                resultRequestDto
            )
        }
    }
}

data class ResultNode(
    val subQuestion : String,
    val subQuestionKeyword : String,
    val subAnswer : String,
    val subAnswerRating : Int,
    val subAnswerAlt : String,
    val top5List : List<Pair<String, String>>,
)