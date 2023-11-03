package net.elau.example.springdatajpakotlin.model

import jakarta.persistence.*
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.InheritanceType.SINGLE_TABLE
import java.util.*

@Entity
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
open class Request protected constructor(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,
    @Column(nullable = false)
    val requestCode: UUID,
    @Column(insertable = false, updatable = false)
    val type: RequestType
)