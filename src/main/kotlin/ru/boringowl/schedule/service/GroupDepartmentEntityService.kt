package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.GroupDepartmentEntity

import java.util.*

interface GroupDepartmentEntityService {
    fun save(groupdepartmententity: GroupDepartmentEntity): GroupDepartmentEntity
    fun find(id: Long): Optional<GroupDepartmentEntity?>
    fun findAll(): List<GroupDepartmentEntity?>
    fun findAll(sort: Sort?): List<GroupDepartmentEntity?>
    fun findAll(pageable: Pageable?): Page<GroupDepartmentEntity?>
    fun delete(id: Long)
    fun delete(groupdepartmententity: GroupDepartmentEntity)
    fun deleteAll()
    fun count(): Long
}