package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.DepartmentEntity
import ru.boringowl.schedule.repo.DepartmentEntityRepository

import java.util.*

@Service
class DepartmentEntityServiceImpl : DepartmentEntityService {
    @Autowired
    private val departmententityRepository: DepartmentEntityRepository? = null
    override fun save(departmententity: DepartmentEntity): DepartmentEntity {
        return departmententityRepository!!.save(departmententity)
    }

    override fun find(id: Long): Optional<DepartmentEntity?> {
        return departmententityRepository!!.findById(id)
    }

    override fun findAll(): List<DepartmentEntity?> {
        return departmententityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<DepartmentEntity?> {
        return departmententityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<DepartmentEntity?> {
        return departmententityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        departmententityRepository!!.deleteById(id)
    }

    override fun delete(departmententity: DepartmentEntity) {
        departmententityRepository!!.delete(departmententity)
    }

    override fun deleteAll() {
        departmententityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return departmententityRepository!!.count()
    }
}