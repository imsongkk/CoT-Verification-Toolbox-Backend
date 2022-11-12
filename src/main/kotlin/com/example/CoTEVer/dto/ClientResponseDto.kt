package com.example.CoTEVer.dto

data class ClientResponseDto(
    val query : String,
    val stepCount : Int,
    val nodeList: List<Node>
)

data class Node(
    val subQuestion : String,
    val subQuestionKeyword : String,
    val subAnswer : String,
    val top5List : List<Pair<String, String>>,
)