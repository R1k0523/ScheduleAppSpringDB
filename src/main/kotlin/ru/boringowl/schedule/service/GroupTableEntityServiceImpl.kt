package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.GroupTableEntity
import ru.boringowl.schedule.repo.GroupTableEntityRepository

import java.util.*

@Service
class GroupTableEntityServiceImpl : GroupTableEntityService {
    @Autowired
    private val grouptableentityRepository: GroupTableEntityRepository? = null
    override fun save(grouptableentity: GroupTableEntity): GroupTableEntity {
        return grouptableentityRepository!!.save(grouptableentity)
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