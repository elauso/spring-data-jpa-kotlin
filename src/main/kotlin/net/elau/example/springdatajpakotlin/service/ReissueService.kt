package net.elau.example.springdatajpakotlin.service

import net.elau.example.springdatajpakotlin.dto.CreateReissueDTO
import net.elau.example.springdatajpakotlin.mapper.toModel
import net.elau.example.springdatajpakotlin.repository.ReissueRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ReissueService(private val reissueRepository: ReissueRepository) {

    @Transactional
    fun create(createReissueDTO: CreateReissueDTO) {
        reissueRepository.save(createReissueDTO.toModel())
    }
}