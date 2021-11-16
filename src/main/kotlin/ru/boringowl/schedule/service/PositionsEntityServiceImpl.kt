package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.PositionsEntity
import ru.boringowl.schedule.repo.PositionsEntityRepository

import java.util.*

@Service
class PositionsEntityServiceImpl : PositionsEntityService {
    @Autowired
    private val positionsentityRepository: PositionsEntityRepository? = null
    override fun save(positionsentity: PositionsEntity): PositionsEntity {
        return positionsentityRepository!!.save(positionsentity)
    }

    override fun find(id: Long): Optional<PositionsEntity?> {
        return positionsentityRepository!!.findById(id)
    }

    override fun findAll(): List<PositionsEntity?> {
        return positionsentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<PositionsEntity?> {
        return positionsentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<PositionsEntity?> {
        return positionsentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        positionsentityRepository!!.deleteById(id)
    }

    override fun delete(positionsentity: PositionsEntity) {
        positionsentityRepository!!.delete(positionsentity)
    }

    override fun deleteAll() {
        positionsentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return positionsentityRepository!!.count()
    }
}