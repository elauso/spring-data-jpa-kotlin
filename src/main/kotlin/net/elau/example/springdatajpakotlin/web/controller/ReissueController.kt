package net.elau.example.springdatajpakotlin.web.controller

import net.elau.example.springdatajpakotlin.mapper.toDTO
import net.elau.example.springdatajpakotlin.mapper.toResponse
import net.elau.example.springdatajpakotlin.service.ReissueService
import net.elau.example.springdatajpakotlin.web.request.CreateReissueRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/reissues")
class ReissueController(private val reissueService: ReissueService) {

    @GetMapping(value = ["/{id}"])
    fun findById(@PathVariable("id") id: Long) = reissueService.findById(id).toResponse()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody createReissueRequest: CreateReissueRequest) =
        reissueService.create(createReissueRequest.toDTO()).toResponse()
}