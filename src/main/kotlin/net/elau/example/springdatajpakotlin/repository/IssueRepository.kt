package net.elau.example.springdatajpakotlin.repository

import net.elau.example.springdatajpakotlin.model.Issue
import org.springframework.data.repository.CrudRepository

interface IssueRepository : CrudRepository<Issue, Long> {
}