package ru.boringowl.schedule.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import ru.boringowl.schedule.entities.ClassroomEntity
import ru.boringowl.schedule.repo.ClassroomEntityRepository

import java.util.*

@Service
class ClassroomEntityServiceImpl : ClassroomEntityService {
    @Autowired
    private val classroomentityRepository: ClassroomEntityRepository? = null
    override fun save(classroomentity: ClassroomEntity): ClassroomEntity {
        val classroom = classroomentity.classroomName?.let {
            classroomentityRepository!!.findClassroomEntityByClassroomName(
                it
            )
        }
        if (classroom != null) {
            if (classroom.isPresent) {
                classroomentity.classroomId = classroom.get().classroomId
            }
        }
        return classroomentityRepository!!.save(classroomentity)
    }

    override fun find(id: Long): Optional<ClassroomEntity?> {
        return classroomentityRepository!!.findById(id)
    }

    override fun findAll(): List<ClassroomEntity?> {
        return classroomentityRepository!!.findAll()
    }

    override fun findAll(sort: Sort?): List<ClassroomEntity?> {
        return classroomentityRepository!!.findAll(sort!!)
    }

    override fun findAll(pageable: Pageable?): Page<ClassroomEntity?> {
        return classroomentityRepository!!.findAll(pageable!!)
    }

    override fun delete(id: Long) {
        classroomentityRepository!!.deleteById(id)
    }

    override fun delete(classroomentity: ClassroomEntity) {
        classroomentityRepository!!.delete(classroomentity)
    }

    override fun deleteAll() {
        classroomentityRepository!!.deleteAll()
    }

    override fun count(): Long {
        return classroomentityRepository!!.count()
    }
}