package net.elau.example.springdatajpakotlin.mapper

import net.elau.example.springdatajpakotlin.dto.CreateReissueDTO
import net.elau.example.springdatajpakotlin.dto.ReissueDTO
import net.elau.example.springdatajpakotlin.model.Reissue
import net.elau.example.springdatajpakotlin.web.request.CreateReissueRequest
import net.elau.example.springdatajpakotlin.web.response.ReissueResponse
import java.util.*

fun CreateReissueDTO.toModel() = Reissue(
    cardCancelledCode = cardCancelledCode,
    requestCode = UUID.randomUUID()
)

fun CreateReissueRequest.toDTO() = CreateReissueDTO(
    cardCancelledCode = UUID.fromString(cardCancelledCode)
)

fun Reissue.toDTO() = ReissueDTO(
    id = id!!,
    requestCode = requestCode,
    cardCancelledCode = cardCancelledCode!!
)

fun ReissueDTO.toResponse() = ReissueResponse(
    id = id,
    requestCode = requestCode,
    cardCancelledCode = cardCancelledCode
)