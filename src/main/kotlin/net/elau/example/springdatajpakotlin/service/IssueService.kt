package net.elau.example.springdatajpakotlin.service

import net.elau.example.springdatajpakotlin.dto.CreateIssueDTO
import net.elau.example.springdatajpakotlin.mapper.toModel
import net.elau.example.springdatajpakotlin.repository.IssueRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueService(private val issueRepository: IssueRepository) {

    @Transactional
    fun create(createIssueDTO: CreateIssueDTO) {
        issueRepository.save(createIssueDTO.toModel())
    }
}