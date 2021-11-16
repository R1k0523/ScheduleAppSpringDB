package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.UsersEntity

import java.util.*

interface UsersEntityService {
    fun save(usersentity: UsersEntity): UsersEntity
    fun find(id: Long): Optional<UsersEntity?>
    fun findAll(): List<UsersEntity?>
    fun findAll(sort: Sort?): List<UsersEntity?>
    fun findAll(pageable: Pageable?): Page<UsersEntity?>
    fun delete(id: Long)
    fun delete(usersentity: UsersEntity)
    fun deleteAll()
    fun count(): Long
}