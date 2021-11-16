package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.PositionsEntity

import java.util.*

interface PositionsEntityService {
    fun save(positionsentity: PositionsEntity): PositionsEntity
    fun find(id: Long): Optional<PositionsEntity?>
    fun findAll(): List<PositionsEntity?>
    fun findAll(sort: Sort?): List<PositionsEntity?>
    fun findAll(pageable: Pageable?): Page<PositionsEntity?>
    fun delete(id: Long)
    fun delete(positionsentity: PositionsEntity)
    fun deleteAll()
    fun count(): Long
}