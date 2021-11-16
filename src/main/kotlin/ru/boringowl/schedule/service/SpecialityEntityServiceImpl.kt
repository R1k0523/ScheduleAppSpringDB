package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.SpecialityEntity
import ru.boringowl.schedule.repo.SpecialityEntityRepository

import java.util.*

@Service
class SpecialityEntityServiceImpl : SpecialityEntityService {
    @Autowired
    private val specialityentityRepository: SpecialityEntityRepository? = null
    override fun save(specialityentity: SpecialityEntity): SpecialityEntity {
        return specialityentityRepository!!.save(specialityentity)
    }

    override fun find(id: Long): Optional<SpecialityEntity?> {
        return specialityentityRepository!!.findById(id)
    }

    override fun findAll(): List<SpecialityEntity?> {
        return specialityentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<SpecialityEntity?> {
        return specialityentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<SpecialityEntity?> {
        return specialityentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        specialityentityRepository!!.deleteById(id)
    }

    override fun delete(specialityentity: SpecialityEntity) {
        specialityentityRepository!!.delete(specialityentity)
    }

    override fun deleteAll() {
        specialityentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return specialityentityRepository!!.count()
    }
}