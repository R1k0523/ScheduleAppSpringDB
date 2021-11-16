package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.IntervalTableEntity

import java.util.*

interface IntervalTableEntityService {
    fun save(intervaltableentity: IntervalTableEntity): IntervalTableEntity
    fun find(id: Long): Optional<IntervalTableEntity?>
    fun findAll(): List<IntervalTableEntity?>
    fun findAll(sort: Sort?): List<IntervalTableEntity?>
    fun findAll(pageable: Pageable?): Page<IntervalTableEntity?>
    fun delete(id: Long)
    fun delete(intervaltableentity: IntervalTableEntity)
    fun deleteAll()
    fun count(): Long
}