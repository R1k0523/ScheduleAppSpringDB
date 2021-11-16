package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.GroupCampusEntity

import java.util.*

interface GroupCampusEntityService {
    fun save(groupcampusentity: GroupCampusEntity): GroupCampusEntity
    fun find(id: Long): Optional<GroupCampusEntity?>
    fun findAll(): List<GroupCampusEntity?>
    fun findAll(sort: Sort?): List<GroupCampusEntity?>
    fun findAll(pageable: Pageable?): Page<GroupCampusEntity?>
    fun delete(id: Long)
    fun delete(groupcampusentity: GroupCampusEntity)
    fun deleteAll()
    fun count(): Long
}