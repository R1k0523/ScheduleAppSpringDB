package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.LessonEntity

import java.util.*

interface LessonEntityService {
    fun save(lessonentity: LessonEntity): LessonEntity
    fun find(id: Long): Optional<LessonEntity?>
    fun findAll(): List<LessonEntity?>
    fun findAll(sort: Sort?): List<LessonEntity?>
    fun findAll(pageable: Pageable?): Page<LessonEntity?>
    fun delete(id: Long)
    fun delete(lessonentity: LessonEntity)
    fun deleteAll()
    fun count(): Long
}