package com.example.CoTEVer.dto

data class ClientResponseDto(
    val query : String,
    val stepCount : Int,
    val nodeList: List<Node>
)

data class Node(
    val subQuery : String,
    val solution : String,
    val url : String,
)