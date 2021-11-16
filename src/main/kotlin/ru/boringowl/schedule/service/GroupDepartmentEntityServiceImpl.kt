package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.GroupDepartmentEntity
import ru.boringowl.schedule.repo.GroupDepartmentEntityRepository

import java.util.*

@Service
class GroupDepartmentEntityServiceImpl : GroupDepartmentEntityService {
    @Autowired
    private val groupdepartmententityRepository: GroupDepartmentEntityRepository? = null
    override fun save(groupdepartmententity: GroupDepartmentEntity): GroupDepartmentEntity {
        return groupdepartmententityRepository!!.save(groupdepartmententity)
    }

    override fun find(id: Long): Optional<GroupDepartmentEntity?> {
        return groupdepartmententityRepository!!.findById(id)
    }

    override fun findAll(): List<GroupDepartmentEntity?> {
        return groupdepartmententityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<GroupDepartmentEntity?> {
        return groupdepartmententityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<GroupDepartmentEntity?> {
        return groupdepartmententityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        groupdepartmententityRepository!!.deleteById(id)
    }

    override fun delete(groupdepartmententity: GroupDepartmentEntity) {
        groupdepartmententityRepository!!.delete(groupdepartmententity)
    }

    override fun deleteAll() {
        groupdepartmententityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return groupdepartmententityRepository!!.count()
    }
}