package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.TutorEntity
import ru.boringowl.schedule.repo.DepartmentEntityRepository
import ru.boringowl.schedule.repo.PositionsEntityRepository
import ru.boringowl.schedule.repo.TutorEntityRepository

import java.util.*

@Service
class TutorEntityServiceImpl : TutorEntityService {
    @Autowired
    private val tutorentityRepository: TutorEntityRepository? = null
    @Autowired
    private val departmentEntityRepository: DepartmentEntityRepository? = null
    @Autowired
    private val positionsEntityServiceImpl: PositionsEntityServiceImpl? = null
    override fun save(tutorentity: TutorEntity): TutorEntity {
        val department = tutorentity.department?.departmentName?.let {
            departmentEntityRepository!!.findDepartmentEntityByDepartmentName(
                it
            )
        }
        if (department != null) {
            if (department.isPresent) {
                tutorentity.department!!.departmentId = department.get().departmentId
            }
        }
        tutorentity.position!!.forEachIndexed { index, positionsEntity ->
            positionsEntity.positionsId = positionsEntityServiceImpl!!.save(positionsEntity).positionsId
        }
        val tutor = tutorentity.fullName?.let {
            tutorentityRepository!!.findTutorEntityByFullName(
                it
            )
        }
        if (tutor != null) {
            if (tutor.isPresent) {
                tutorentity.tutorId = tutor.get().tutorId
            }
        }
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