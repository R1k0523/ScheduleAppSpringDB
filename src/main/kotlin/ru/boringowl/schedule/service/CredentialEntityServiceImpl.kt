package ru.boringowl.schedule.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.CredentialEntity
import ru.boringowl.schedule.repo.CredentialEntityRepository

import java.util.*

@Service
class CredentialEntityServiceImpl : CredentialEntityService {
    @Autowired
    private val credentialentityRepository: CredentialEntityRepository? = null
    override fun save(credentialentity: CredentialEntity): CredentialEntity {
        return credentialentityRepository!!.save(credentialentity)
    }

    override fun find(id: Long): Optional<CredentialEntity?> {
        return credentialentityRepository!!.findById(id)
    }

    override fun findAll(): List<CredentialEntity?> {
        return credentialentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<CredentialEntity?> {
        return credentialentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<CredentialEntity?> {
        return credentialentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        credentialentityRepository!!.deleteById(id)
    }

    override fun delete(credentialentity: CredentialEntity) {
        credentialentityRepository!!.delete(credentialentity)
    }

    override fun deleteAll() {
        credentialentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return credentialentityRepository!!.count()
    }
}