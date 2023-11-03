package net.elau.example.springdatajpakotlin.web.response

import java.util.*

data class IssueResponse(
    val id: Long,
    val requestCode: UUID,
    val offerCode: UUID
)
