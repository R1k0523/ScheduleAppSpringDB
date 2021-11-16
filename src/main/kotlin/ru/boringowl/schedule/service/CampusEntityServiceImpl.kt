package ru.boringowl.schedule.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.CampusEntity
import ru.boringowl.schedule.repo.CampusEntityRepository
import java.util.*

@Service
class CampusEntityServiceImpl : CampusEntityService {
    @Autowired
    private val campusentityRepository: CampusEntityRepository? = null
    override fun save(campusentity: CampusEntity): CampusEntity {
        return campusentityRepository!!.save(campusentity)
    }

    override fun find(id: Long): Optional<CampusEntity?> {
        return campusentityRepository!!.findById(id)
    }

    override fun findAll(): List<CampusEntity?> {
        return campusentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<CampusEntity?> {
        return campusentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<CampusEntity?> {
        return campusentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        campusentityRepository!!.deleteById(id)
    }

    override fun delete(campusentity: CampusEntity) {
        campusentityRepository!!.delete(campusentity)
    }

    override fun deleteAll() {
        campusentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return campusentityRepository!!.count()
    }
}