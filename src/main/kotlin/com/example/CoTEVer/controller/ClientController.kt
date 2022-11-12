package com.example.CoTEVer.controller

import com.example.CoTEVer.dto.QueryRequestDto
import com.example.CoTEVer.dto.QueryResponseDto
import com.example.CoTEVer.dto.ResultRequestDto
import com.example.CoTEVer.service.QueryService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin("*")
class ClientController(
    val queryService: QueryService
){
    @PostMapping("/query")
    fun userQuery(@RequestBody queryRequestDto: QueryRequestDto) : QueryResponseDto{
        return queryService.getAnswer(queryRequestDto.query)
    }

    @PostMapping("/result")
    fun userResult(@RequestBody resultRequestDto: ResultRequestDto){
        queryService.saveResult(resultRequestDto)
    }
}