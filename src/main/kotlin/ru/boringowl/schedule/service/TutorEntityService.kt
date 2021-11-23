package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.TutorEntity
import ru.boringowl.schedule.entities.Week

import java.util.*

interface TutorEntityService {
    fun save(tutorentity: TutorEntity): TutorEntity
    fun find(id: Long): Optional<TutorEntity?>
    fun find(tutorsName: String): Week
    fun findTutors(tutorsName: String): List<TutorEntity?>
    fun findAll(): List<TutorEntity?>
    fun findAll(sort: Sort?): List<TutorEntity?>
    fun findAll(pageable: Pageable?): Page<TutorEntity?>
    fun delete(id: Long)
    fun delete(tutorentity: TutorEntity)
    fun deleteAll()
    fun count(): Long
}