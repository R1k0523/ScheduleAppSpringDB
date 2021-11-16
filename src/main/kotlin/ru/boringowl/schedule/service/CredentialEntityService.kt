package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.CredentialEntity

import java.util.*

interface CredentialEntityService {
    fun save(credentialentity: CredentialEntity): CredentialEntity
    fun find(id: Long): Optional<CredentialEntity?>
    fun findAll(): List<CredentialEntity?>
    fun findAll(sort: Sort?): List<CredentialEntity?>
    fun findAll(pageable: Pageable?): Page<CredentialEntity?>
    fun delete(id: Long)
    fun delete(credentialentity: CredentialEntity)
    fun deleteAll()
    fun count(): Long
}