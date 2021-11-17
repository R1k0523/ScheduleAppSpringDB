package ru.boringowl.schedule.service

import ru.boringowl.schedule.service.TutorEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.LessonEntity
import ru.boringowl.schedule.repo.LessonEntityRepository

import java.util.*

@Service
class LessonEntityServiceImpl : LessonEntityService {
    @Autowired
    private val lessonentityRepository: LessonEntityRepository? = null
    @Autowired
    private val groupTableEntityService: GroupTableEntityServiceImpl? = null
    @Autowired
    private val tutorEntityServiceImpl: TutorEntityServiceImpl? = null
    @Autowired
    private val subjectEntityServiceImpl: SubjectEntityServiceImpl? = null
    @Autowired
    private val classroomEntityServiceImpl: ClassroomEntityServiceImpl? = null
    @Autowired
    private val intervalTableEntityServiceImpl: IntervalTableEntityServiceImpl? = null

    override fun save(lessonentity: LessonEntity): LessonEntity {
        lessonentity.group = groupTableEntityService!!.save(lessonentity.group!!)
        lessonentity.tutor = tutorEntityServiceImpl!!.save(lessonentity.tutor!!)
        lessonentity.subject = subjectEntityServiceImpl!!.save(lessonentity.subject!!)
        lessonentity.classroom = classroomEntityServiceImpl!!.save(lessonentity.classroom!!)
        lessonentity.interval = intervalTableEntityServiceImpl!!.save(lessonentity.interval!!)
        return lessonentityRepository!!.save(lessonentity)
    }

    override fun find(id: Long): Optional<LessonEntity?> {
        return lessonentityRepository!!.findById(id)
    }

    override fun findAll(): List<LessonEntity?> {
        return lessonentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<LessonEntity?> {
        return lessonentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<LessonEntity?> {
        return lessonentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        lessonentityRepository!!.deleteById(id)
    }

    override fun delete(lessonentity: LessonEntity) {
        lessonentityRepository!!.delete(lessonentity)
    }

    override fun deleteAll() {
        lessonentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return lessonentityRepository!!.count()
    }
}