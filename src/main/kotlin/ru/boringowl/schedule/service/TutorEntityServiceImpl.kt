package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.TutorEntity
import ru.boringowl.schedule.repo.TutorEntityRepository

import java.util.*

@Service
class TutorEntityServiceImpl : TutorEntityService {
    @Autowired
    private val tutorentityRepository: TutorEntityRepository? = null
    override fun save(tutorentity: TutorEntity): TutorEntity {
        return tutorentityRepository!!.save(tutorentity)
    }

    override fun find(id: Long): Optional<TutorEntity?> {
        return tutorentityRepository!!.findById(id)
    }

    override fun findAll(): List<TutorEntity?> {
        return tutorentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<TutorEntity?> {
        return tutorentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<TutorEntity?> {
        return tutorentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        tutorentityRepository!!.deleteById(id)
    }

    override fun delete(tutorentity: TutorEntity) {
        tutorentityRepository!!.delete(tutorentity)
    }

    override fun deleteAll() {
        tutorentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return tutorentityRepository!!.count()
    }
}