package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.SchedulesEntity
import ru.boringowl.schedule.repo.SchedulesEntityRepository

import java.util.*

@Service
class SchedulesEntityServiceImpl : SchedulesEntityService {
    @Autowired
    private val schedulesentityRepository: SchedulesEntityRepository? = null
    @Autowired
    private val lessonEntityServiceImpl: LessonEntityServiceImpl? = null
    override fun save(schedulesentity: SchedulesEntity): SchedulesEntity {
        schedulesentity.lessons!!.forEach {
            lessonEntityServiceImpl!!.save(it)
        }
        return schedulesentityRepository!!.save(schedulesentity)
    }

    override fun findByGroupName(groupName: String): Optional<SchedulesEntity> {
        return schedulesentityRepository!!.findFirstBySchedulesNameEndsWith(groupName)
    }

    override fun find(id: Long): Optional<SchedulesEntity?> {
        return schedulesentityRepository!!.findById(id)
    }

    override fun findAll(): List<SchedulesEntity?> {
        return schedulesentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<SchedulesEntity?> {
        return schedulesentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<SchedulesEntity?> {
        return schedulesentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        schedulesentityRepository!!.deleteById(id)
    }

    override fun delete(schedulesentity: SchedulesEntity) {
        schedulesentityRepository!!.delete(schedulesentity)
    }

    override fun deleteAll() {
        schedulesentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return schedulesentityRepository!!.count()
    }
}