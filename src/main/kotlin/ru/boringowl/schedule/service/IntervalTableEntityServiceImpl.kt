package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.IntervalTableEntity
import ru.boringowl.schedule.repo.IntervalTableEntityRepository

import java.util.*

@Service
class IntervalTableEntityServiceImpl : IntervalTableEntityService {
    @Autowired
    private val intervaltableentityRepository: IntervalTableEntityRepository? = null
    override fun save(intervaltableentity: IntervalTableEntity): IntervalTableEntity {
        return intervaltableentityRepository!!.save(intervaltableentity)
    }

    override fun find(id: Long): Optional<IntervalTableEntity?> {
        return intervaltableentityRepository!!.findById(id)
    }

    override fun findAll(): List<IntervalTableEntity?> {
        return intervaltableentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<IntervalTableEntity?> {
        return intervaltableentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<IntervalTableEntity?> {
        return intervaltableentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        intervaltableentityRepository!!.deleteById(id)
    }

    override fun delete(intervaltableentity: IntervalTableEntity) {
        intervaltableentityRepository!!.delete(intervaltableentity)
    }

    override fun deleteAll() {
        intervaltableentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return intervaltableentityRepository!!.count()
    }
}