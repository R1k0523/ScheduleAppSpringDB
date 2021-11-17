package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.CredentialEntity
import java.util.*

interface CredentialEntityRepository : JpaRepository<CredentialEntity?, Long?> {
    fun findCredentialEntityByCredentialName(name: String): Optional<CredentialEntity>
}