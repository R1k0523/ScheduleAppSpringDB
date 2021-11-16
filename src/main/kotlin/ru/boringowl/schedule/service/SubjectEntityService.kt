package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.SubjectEntity

import java.util.*

interface SubjectEntityService {
    fun save(subjectentity: SubjectEntity): SubjectEntity
    fun find(id: Long): Optional<SubjectEntity?>
    fun findAll(): List<SubjectEntity?>
    fun findAll(sort: Sort?): List<SubjectEntity?>
    fun findAll(pageable: Pageable?): Page<SubjectEntity?>
    fun delete(id: Long)
    fun delete(subjectentity: SubjectEntity)
    fun deleteAll()
    fun count(): Long
}