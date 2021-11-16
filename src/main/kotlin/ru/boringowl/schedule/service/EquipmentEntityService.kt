package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import ru.boringowl.schedule.entities.EquipmentEntity

import java.util.*

interface EquipmentEntityService {
    fun save(equipmententity: EquipmentEntity): EquipmentEntity
    fun find(id: Long): Optional<EquipmentEntity?>
    fun findAll(): List<EquipmentEntity?>
    fun findAll(sort: Sort?): List<EquipmentEntity?>
    fun findAll(pageable: Pageable?): Page<EquipmentEntity?>
    fun delete(id: Long)
    fun delete(equipmententity: EquipmentEntity)
    fun deleteAll()
    fun count(): Long
}