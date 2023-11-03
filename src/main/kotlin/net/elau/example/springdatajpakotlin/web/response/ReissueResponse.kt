package net.elau.example.springdatajpakotlin.web.response

import java.util.*

data class ReissueResponse(
    val id: Long,
    val requestCode: UUID,
    val cardCancelledCode: UUID
)