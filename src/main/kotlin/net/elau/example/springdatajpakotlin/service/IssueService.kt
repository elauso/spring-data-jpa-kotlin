package net.elau.example.springdatajpakotlin.service

import net.elau.example.springdatajpakotlin.dto.CreateIssueDTO
import net.elau.example.springdatajpakotlin.dto.IssueDTO
import net.elau.example.springdatajpakotlin.mapper.toDTO
import net.elau.example.springdatajpakotlin.mapper.toModel
import net.elau.example.springdatajpakotlin.repository.IssueRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueService(private val issueRepository: IssueRepository) {

    @Transactional(readOnly = true)
    fun findById(id: Long) =
        issueRepository.findById(id).orElseThrow().toDTO()

    @Transactional
    fun create(createIssueDTO: CreateIssueDTO): IssueDTO {
        val persisted = issueRepository.save(createIssueDTO.toModel())
        return persisted.toDTO()
    }
}