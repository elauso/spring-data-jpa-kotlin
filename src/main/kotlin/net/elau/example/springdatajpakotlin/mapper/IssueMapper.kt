package net.elau.example.springdatajpakotlin.mapper

import net.elau.example.springdatajpakotlin.dto.CreateIssueDTO
import net.elau.example.springdatajpakotlin.dto.IssueDTO
import net.elau.example.springdatajpakotlin.model.Issue
import net.elau.example.springdatajpakotlin.web.request.CreateIssueRequest
import net.elau.example.springdatajpakotlin.web.response.IssueResponse
import java.util.*

fun CreateIssueDTO.toModel() = Issue(
    offerCode = offerCode,
    requestCode = UUID.randomUUID()
)

fun CreateIssueRequest.toDTO() = CreateIssueDTO(
    offerCode = UUID.fromString(offerCode)
)

fun Issue.toDTO() = IssueDTO(
    id = id!!,
    requestCode = requestCode,
    offerCode = offerCode!!
)

fun IssueDTO.toResponse() = IssueResponse(
    id = id,
    requestCode = requestCode,
    offerCode = offerCode
)