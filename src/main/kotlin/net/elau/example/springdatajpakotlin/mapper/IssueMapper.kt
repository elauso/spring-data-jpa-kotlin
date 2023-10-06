package net.elau.example.springdatajpakotlin.mapper

import net.elau.example.springdatajpakotlin.dto.CreateIssueDTO
import net.elau.example.springdatajpakotlin.model.Issue
import net.elau.example.springdatajpakotlin.web.request.CreateIssueRequest
import java.util.*

fun CreateIssueDTO.toModel() = Issue(
    offerCode = offerCode,
    requestCode = UUID.randomUUID()
)

fun CreateIssueRequest.toDTO() = CreateIssueDTO(
    offerCode = UUID.fromString(offerCode)
)