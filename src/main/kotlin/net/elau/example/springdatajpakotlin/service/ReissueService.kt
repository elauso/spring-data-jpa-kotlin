package net.elau.example.springdatajpakotlin.service

import net.elau.example.springdatajpakotlin.dto.CreateReissueDTO
import net.elau.example.springdatajpakotlin.dto.ReissueDTO
import net.elau.example.springdatajpakotlin.mapper.toDTO
import net.elau.example.springdatajpakotlin.mapper.toModel
import net.elau.example.springdatajpakotlin.repository.ReissueRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ReissueService(private val reissueRepository: ReissueRepository) {

    @Transactional(readOnly = true)
    fun findById(id: Long) =
        reissueRepository.findById(id).orElseThrow().toDTO()

    @Transactional
    fun create(createReissueDTO: CreateReissueDTO): ReissueDTO {
        val persisted = reissueRepository.save(createReissueDTO.toModel())
        return persisted.toDTO()
    }
}