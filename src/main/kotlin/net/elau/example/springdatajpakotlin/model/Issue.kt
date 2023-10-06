package net.elau.example.springdatajpakotlin.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import java.util.*

@Entity
class Issue(
    override var requestCode: UUID? = null,
    @Column(nullable = false)
    var offerCode: UUID? = null
) : Request(requestCode = requestCode)