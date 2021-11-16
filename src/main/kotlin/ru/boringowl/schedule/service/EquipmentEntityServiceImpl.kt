package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.EquipmentEntity
import ru.boringowl.schedule.repo.EquipmentEntityRepository

import java.util.*

@Service
class EquipmentEntityServiceImpl : EquipmentEntityService {
    @Autowired
    private val equipmententityRepository: EquipmentEntityRepository? = null
    override fun save(equipmententity: EquipmentEntity): EquipmentEntity {
        return equipmententityRepository!!.save(equipmententity)
    }

    override fun find(id: Long): Optional<EquipmentEntity?> {
        return equipmententityRepository!!.findById(id)
    }

    override fun findAll(): List<EquipmentEntity?> {
        return equipmententityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<EquipmentEntity?> {
        return equipmententityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<EquipmentEntity?> {
        return equipmententityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        equipmententityRepository!!.deleteById(id)
    }

    override fun delete(equipmententity: EquipmentEntity) {
        equipmententityRepository!!.delete(equipmententity)
    }

    override fun deleteAll() {
        equipmententityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return equipmententityRepository!!.count()
    }
}