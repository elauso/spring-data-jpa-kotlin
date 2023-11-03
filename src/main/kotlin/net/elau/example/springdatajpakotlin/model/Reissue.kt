package net.elau.example.springdatajpakotlin.model

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import net.elau.example.springdatajpakotlin.model.RequestType.REISSUE
import java.util.*

@Entity
@DiscriminatorValue("1")
class Reissue(
    id: Long? = null,
    requestCode: UUID,
    val cardCancelledCode: UUID? = null
) : Request(id, requestCode, REISSUE)