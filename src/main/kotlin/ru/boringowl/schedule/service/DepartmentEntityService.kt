package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.DepartmentEntity

import java.util.*

interface DepartmentEntityService {
    fun save(departmententity: DepartmentEntity): DepartmentEntity
    fun find(id: Long): Optional<DepartmentEntity?>
    fun findAll(): List<DepartmentEntity?>
    fun findAll(sort: Sort?): List<DepartmentEntity?>
    fun findAll(pageable: Pageable?): Page<DepartmentEntity?>
    fun delete(id: Long)
    fun delete(departmententity: DepartmentEntity)
    fun deleteAll()
    fun count(): Long
}