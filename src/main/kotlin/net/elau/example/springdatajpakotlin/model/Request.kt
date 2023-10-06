package net.elau.example.springdatajpakotlin.model

import jakarta.persistence.*
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.InheritanceType.JOINED
import java.util.*

@Entity
@Inheritance(strategy = JOINED)
abstract class Request(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(nullable = false)
    open var id: Long? = null,

    @Column(nullable = false)
    open var requestCode: UUID? = null
)