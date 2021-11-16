package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.UserRoleEntity
import ru.boringowl.schedule.repo.UserRoleEntityRepository

import java.util.*

@Service
class UserRoleEntityServiceImpl : UserRoleEntityService {
    @Autowired
    private val userroleentityRepository: UserRoleEntityRepository? = null
    override fun save(userroleentity: UserRoleEntity): UserRoleEntity {
        return userroleentityRepository!!.save(userroleentity)
    }

    override fun find(id: Long): Optional<UserRoleEntity?> {
        return userroleentityRepository!!.findById(id)
    }

    override fun findAll(): List<UserRoleEntity?> {
        return userroleentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<UserRoleEntity?> {
        return userroleentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<UserRoleEntity?> {
        return userroleentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        userroleentityRepository!!.deleteById(id)
    }

    override fun delete(userroleentity: UserRoleEntity) {
        userroleentityRepository!!.delete(userroleentity)
    }

    override fun deleteAll() {
        userroleentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return userroleentityRepository!!.count()
    }
}