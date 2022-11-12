package com.example.CoTEVer.dto

data class QueryResponseDto(
    val query : String,
    val stepCount : Int,
    val finalAnswer : String,
    val finalExplanation : String,
    val nodeList: List<QueryNode>
)

data class QueryNode(
    val subQuestion : String,
    val subQuestionKeyword : String,
    val subAnswer : String,
    val top5List : List<Pair<String, String>>,
)