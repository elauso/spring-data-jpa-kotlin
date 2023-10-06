package net.elau.example.springdatajpakotlin.mapper

import net.elau.example.springdatajpakotlin.dto.CreateReissueDTO
import net.elau.example.springdatajpakotlin.model.Reissue
import net.elau.example.springdatajpakotlin.web.request.CreateReissueRequest
import java.util.*

fun CreateReissueDTO.toModel() = Reissue(
    cardCancelledCode = cardCancelledCode,
    requestCode = UUID.randomUUID()
)

fun CreateReissueRequest.toDTO() = CreateReissueDTO(
    cardCancelledCode = UUID.fromString(cardCancelledCode)
)