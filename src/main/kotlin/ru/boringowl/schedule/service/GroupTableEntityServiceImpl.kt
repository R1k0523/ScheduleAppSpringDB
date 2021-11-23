package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.GroupTableEntity
import ru.boringowl.schedule.repo.CampusEntityRepository
import ru.boringowl.schedule.repo.DepartmentEntityRepository
import ru.boringowl.schedule.repo.GroupTableEntityRepository
import ru.boringowl.schedule.repo.SpecialityEntityRepository

import java.util.*

@Service
class GroupTableEntityServiceImpl : GroupTableEntityService {
    @Autowired
    private val grouptableentityRepository: GroupTableEntityRepository? = null
    @Autowired
    private val campusEntityRepository: CampusEntityRepository? = null
    @Autowired
    private val departmentEntityRepository: DepartmentEntityRepository? = null
    @Autowired
    private val specialityEntityRepository: SpecialityEntityRepository? = null
    override fun save(grouptableenties: List<GroupTableEntity>): List<GroupTableEntity> {
        val response = arrayListOf<GroupTableEntity>()
        grouptableenties.forEach {
            response.add(save(it))
        }
        return response
    }

    override fun save(grouptableenty: GroupTableEntity): GroupTableEntity {
        val campus =
            campusEntityRepository!!.findByCampusName(grouptableenty.department?.campus?.campusName!!)
        if (campus.isPresent) {
            grouptableenty.department?.campus?.campusId = campus.get().campusId
        }
        val speciality =
            specialityEntityRepository!!.findSpecialityEntityBySpecialityName(
                grouptableenty.speciality?.specialityName!!
            )
        if (speciality.isPresent) {
            grouptableenty.speciality!!.specialityId = speciality.get().specialityId
        }

        val department =
            departmentEntityRepository!!.findDepartmentEntityByDepartmentName(
                grouptableenty.department?.departmentName!!
            )
        if (department.isPresent) {
            grouptableenty.department!!.departmentId = department.get().departmentId
        }
        return grouptableentityRepository!!.save(grouptableenty)
    }

    override fun find(id: String): Optional<GroupTableEntity?> {
        return grouptableentityRepository!!.findById(id)
    }

    override fun findAll(): List<GroupTableEntity?> {
        return grouptableentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<GroupTableEntity?> {
        return grouptableentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<GroupTableEntity?> {
        return grouptableentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: String) {
        grouptableentityRepository!!.deleteById(id)
    }

    override fun delete(grouptableentity: GroupTableEntity) {
        grouptableentityRepository!!.delete(grouptableentity)
    }

    override fun deleteAll() {
        grouptableentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return grouptableentityRepository!!.count()
    }
}