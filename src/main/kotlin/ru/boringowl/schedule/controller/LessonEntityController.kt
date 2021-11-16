package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.LessonEntity
import ru.boringowl.schedule.service.LessonEntityService
import java.util.*

@RestController
@RequestMapping("api")
class LessonEntityController {
    @Autowired
    private val lessonentityService: LessonEntityService? = null
    @PostMapping("/lesson")
    fun save(@RequestBody lessonentity: LessonEntity?): LessonEntity {
        return lessonentityService!!.save(lessonentity!!)
    }

    @GetMapping("/lesson/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<LessonEntity?> {
        return lessonentityService!!.find(id!!)
    }

    @get:GetMapping("/lesson")
    val all: List<LessonEntity?>
        get() = lessonentityService!!.findAll()

    @DeleteMapping("/lesson/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        lessonentityService!!.delete(id!!)
    }

    @DeleteMapping("/lesson")
    fun deleteAll() {
        lessonentityService!!.deleteAll()
    }

    @GetMapping("/lesson/count")
    fun count(): Long {
        return lessonentityService!!.count()
    }
}