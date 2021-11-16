package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.GroupCampusEntity
import ru.boringowl.schedule.repo.GroupCampusEntityRepository

import java.util.*

@Service
class GroupCampusEntityServiceImpl : GroupCampusEntityService {
    @Autowired
    private val groupcampusentityRepository: GroupCampusEntityRepository? = null
    override fun save(groupcampusentity: GroupCampusEntity): GroupCampusEntity {
        return groupcampusentityRepository!!.save(groupcampusentity)
    }

    override fun find(id: Long): Optional<GroupCampusEntity?> {
        return groupcampusentityRepository!!.findById(id)
    }

    override fun findAll(): List<GroupCampusEntity?> {
        return groupcampusentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<GroupCampusEntity?> {
        return groupcampusentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<GroupCampusEntity?> {
        return groupcampusentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        groupcampusentityRepository!!.deleteById(id)
    }

    override fun delete(groupcampusentity: GroupCampusEntity) {
        groupcampusentityRepository!!.delete(groupcampusentity)
    }

    override fun deleteAll() {
        groupcampusentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return groupcampusentityRepository!!.count()
    }
}