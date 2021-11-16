package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.SubjectEntity
import ru.boringowl.schedule.repo.SubjectEntityRepository

import java.util.*

@Service
class SubjectEntityServiceImpl : SubjectEntityService {
    @Autowired
    private val subjectentityRepository: SubjectEntityRepository? = null
    override fun save(subjectentity: SubjectEntity): SubjectEntity {
        return subjectentityRepository!!.save(subjectentity)
    }

    override fun find(id: Long): Optional<SubjectEntity?> {
        return subjectentityRepository!!.findById(id)
    }

    override fun findAll(): List<SubjectEntity?> {
        return subjectentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<SubjectEntity?> {
        return subjectentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<SubjectEntity?> {
        return subjectentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        subjectentityRepository!!.deleteById(id)
    }

    override fun delete(subjectentity: SubjectEntity) {
        subjectentityRepository!!.delete(subjectentity)
    }

    override fun deleteAll() {
        subjectentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return subjectentityRepository!!.count()
    }
}