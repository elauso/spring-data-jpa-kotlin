package net.elau.example.springdatajpakotlin.repository

import net.elau.example.springdatajpakotlin.model.Reissue
import org.springframework.data.repository.CrudRepository

interface ReissueRepository : CrudRepository<Reissue, Long> {
}