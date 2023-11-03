package net.elau.example.springdatajpakotlin.dto

import java.util.*

data class IssueDTO(
    val id: Long,
    val requestCode: UUID,
    val offerCode: UUID
)
