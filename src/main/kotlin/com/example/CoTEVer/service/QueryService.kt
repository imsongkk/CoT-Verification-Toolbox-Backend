package com.example.CoTEVer.service

import com.example.CoTEVer.dto.ClientResponseDto
import com.example.CoTEVer.dto.Node
import com.example.CoTEVer.entity.Log
import com.example.CoTEVer.repository.LogRepository
import org.springframework.stereotype.Service

@Service
class QueryService(
    val logRepository: LogRepository
) {
    fun getAnswer(query : String) : ClientResponseDto{
        val res = ClientResponseDto(query, 2, listOf(
            Node("subquery1", subQuestionKeyword = "keyword1", subAnswer = "solution1", top5List = listOf(
                Pair("www.naver.com","A"),
                Pair("www.naverB.com","B"),
                Pair("www.naverC.com","C"),
                Pair("www.naverC.com","D"),
                Pair("www.naverC.com","E"))),
            Node("subquery2", subQuestionKeyword = "keyword2", subAnswer = "solution2", top5List = listOf(
                Pair("www.google.com","A"),
                Pair("www.googleB.com","B"),
                Pair("www.googleC.com","C"),
                Pair("www.googleD.com","D"),
                Pair("www.googleE.com","E")))
        ))
        logRepository.save(Log(test = "A"))
        return res
    }
}