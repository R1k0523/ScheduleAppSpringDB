package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.SpecialityEntity

import java.util.*

interface SpecialityEntityService {
    fun save(specialityentity: SpecialityEntity): SpecialityEntity
    fun find(id: Long): Optional<SpecialityEntity?>
    fun findAll(): List<SpecialityEntity?>
    fun findAll(sort: Sort?): List<SpecialityEntity?>
    fun findAll(pageable: Pageable?): Page<SpecialityEntity?>
    fun delete(id: Long)
    fun delete(specialityentity: SpecialityEntity)
    fun deleteAll()
    fun count(): Long
}