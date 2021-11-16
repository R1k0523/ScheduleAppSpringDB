package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.SchedulesEntity

import java.util.*

interface SchedulesEntityService {
    fun save(schedulesentity: SchedulesEntity): SchedulesEntity
    fun find(id: Long): Optional<SchedulesEntity?>
    fun findAll(): List<SchedulesEntity?>
    fun findAll(sort: Sort?): List<SchedulesEntity?>
    fun findAll(pageable: Pageable?): Page<SchedulesEntity?>
    fun delete(id: Long)
    fun delete(schedulesentity: SchedulesEntity)
    fun deleteAll()
    fun count(): Long
}