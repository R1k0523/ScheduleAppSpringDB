package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.UserRoleEntity

import java.util.*

interface UserRoleEntityService {
    fun save(userroleentity: UserRoleEntity): UserRoleEntity
    fun find(id: Long): Optional<UserRoleEntity?>
    fun findAll(): List<UserRoleEntity?>
    fun findAll(sort: Sort?): List<UserRoleEntity?>
    fun findAll(pageable: Pageable?): Page<UserRoleEntity?>
    fun delete(id: Long)
    fun delete(userroleentity: UserRoleEntity)
    fun deleteAll()
    fun count(): Long
}