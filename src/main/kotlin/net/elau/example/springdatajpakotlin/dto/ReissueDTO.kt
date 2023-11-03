package net.elau.example.springdatajpakotlin.dto

import java.util.*

data class ReissueDTO(
    val id: Long,
    val requestCode: UUID,
    val cardCancelledCode: UUID
)
