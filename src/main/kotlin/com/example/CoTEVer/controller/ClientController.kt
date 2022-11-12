package com.example.CoTEVer.controller

import com.example.CoTEVer.dto.ClientRequestDto
import com.example.CoTEVer.dto.ClientResponseDto
import com.example.CoTEVer.dto.Node
import com.example.CoTEVer.service.QueryService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin("*")
class ClientController(
    val queryService: QueryService
){
    @GetMapping("/query")
    fun userQuery(@RequestBody clientRequestDto: ClientRequestDto) : ClientResponseDto{
        return queryService.getAnswer(clientRequestDto.query)
    }
}