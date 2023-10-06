package net.elau.example.springdatajpakotlin.web.controller

import net.elau.example.springdatajpakotlin.mapper.toDTO
import net.elau.example.springdatajpakotlin.service.IssueService
import net.elau.example.springdatajpakotlin.web.request.CreateIssueRequest
import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/issues")
class IssueController(private val issueService: IssueService) {

    @PostMapping
    @ResponseStatus(CREATED)
    fun create(@RequestBody createIssueRequest: CreateIssueRequest) =
        issueService.create(createIssueRequest.toDTO())
}