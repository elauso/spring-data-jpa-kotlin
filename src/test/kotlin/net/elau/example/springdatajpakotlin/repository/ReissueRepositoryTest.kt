package net.elau.example.springdatajpakotlin.repository

import net.elau.example.springdatajpakotlin.model.Reissue
import net.elau.example.springdatajpakotlin.model.RequestType
import net.elau.example.springdatajpakotlin.model.RequestType.REISSUE
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import java.util.*

@DataJpaTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ReissueRepositoryTest @Autowired constructor(private val reissueRepository: ReissueRepository) {

    val reissue = Reissue(requestCode = UUID.randomUUID(), cardCancelledCode = UUID.randomUUID())

    @BeforeAll
    fun setup() {
        reissueRepository.save(reissue)
    }

    @Test
    fun `should find all reissues`() {
        val reissue = reissueRepository.findAll().iterator().next()
        Assertions.assertNotNull(reissue.id)
        Assertions.assertNotNull(reissue.requestCode)
        Assertions.assertNotNull(reissue.cardCancelledCode)
        Assertions.assertEquals(REISSUE, reissue.type)
    }
}