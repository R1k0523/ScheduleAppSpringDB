package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.ClassroomEntity

import java.util.*

interface ClassroomEntityService {
    fun save(classroomentity: ClassroomEntity): ClassroomEntity
    fun find(id: Long): Optional<ClassroomEntity?>
    fun findAll(): List<ClassroomEntity?>
    fun findAll(sort: Sort?): List<ClassroomEntity?>
    fun findAll(pageable: Pageable?): Page<ClassroomEntity?>
    fun delete(id: Long)
    fun delete(classroomentity: ClassroomEntity)
    fun deleteAll()
    fun count(): Long
}