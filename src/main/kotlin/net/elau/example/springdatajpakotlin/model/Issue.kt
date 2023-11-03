package net.elau.example.springdatajpakotlin.model

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import net.elau.example.springdatajpakotlin.model.RequestType.ISSUE
import java.util.*

@Entity
@DiscriminatorValue("0")
class Issue(
    id: Long? = null,
    requestCode: UUID,
    val offerCode: UUID? = null
) : Request(id, requestCode, ISSUE)