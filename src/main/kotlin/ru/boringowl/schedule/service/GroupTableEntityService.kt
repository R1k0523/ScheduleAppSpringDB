package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.GroupTableEntity

import java.util.*

interface GroupTableEntityService {
    fun save(grouptableenties: List<GroupTableEntity>): List<GroupTableEntity>
    fun save(grouptableenty: GroupTableEntity): GroupTableEntity
    fun find(id: String): Optional<GroupTableEntity?>
    fun findAll(): List<GroupTableEntity?>
    fun findAll(sort: Sort?): List<GroupTableEntity?>
    fun findAll(pageable: Pageable?): Page<GroupTableEntity?>
    fun delete(id: String)
    fun delete(grouptableentity: GroupTableEntity)
    fun deleteAll()
    fun count(): Long
}