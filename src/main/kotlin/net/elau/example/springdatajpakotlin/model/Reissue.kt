package net.elau.example.springdatajpakotlin.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import java.util.*

@Entity
class Reissue(
    override var requestCode: UUID? = null,
    @Column(nullable = false)
    var cardCancelledCode: UUID? = null
) : Request(requestCode = requestCode)