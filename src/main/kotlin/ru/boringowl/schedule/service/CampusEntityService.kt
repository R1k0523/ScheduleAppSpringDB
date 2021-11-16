package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.CampusEntity

import java.util.*

interface CampusEntityService {
    fun save(campusentity: CampusEntity): CampusEntity
    fun find(id: Long): Optional<CampusEntity?>
    fun findAll(): List<CampusEntity?>
    fun findAll(sort: Sort?): List<CampusEntity?>
    fun findAll(pageable: Pageable?): Page<CampusEntity?>
    fun delete(id: Long)
    fun delete(campusentity: CampusEntity)
    fun deleteAll()
    fun count(): Long
}