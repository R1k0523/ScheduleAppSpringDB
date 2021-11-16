package ru.boringowl.schedule.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.UsersEntity
import ru.boringowl.schedule.repo.UsersEntityRepository

import java.util.*

@Service
class UsersEntityServiceImpl : UsersEntityService {
    @Autowired
    private val usersentityRepository: UsersEntityRepository? = null
    override fun save(usersentity: UsersEntity): UsersEntity {
        return usersentityRepository!!.save(usersentity)
    }

    override fun find(id: Long): Optional<UsersEntity?> {
        return usersentityRepository!!.findById(id)
    }

    override fun findAll(): List<UsersEntity?> {
        return usersentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<UsersEntity?> {
        return usersentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<UsersEntity?> {
        return usersentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        usersentityRepository!!.deleteById(id)
    }

    override fun delete(usersentity: UsersEntity) {
        usersentityRepository!!.delete(usersentity)
    }

    override fun deleteAll() {
        usersentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return usersentityRepository!!.count()
    }
}