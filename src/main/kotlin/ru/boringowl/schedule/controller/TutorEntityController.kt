package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.FullScheduleModel
import ru.boringowl.schedule.entities.TutorEntity
import ru.boringowl.schedule.entities.Week
import ru.boringowl.schedule.service.TutorEntityService
import java.util.*

@RestController
@RequestMapping("api")
class TutorEntityController {
    @Autowired
    private val tutorentityService: TutorEntityService? = null
    @PostMapping("/tutor")
    fun save(@RequestBody tutorentity: TutorEntity?): TutorEntity {
        return tutorentityService!!.save(tutorentity!!)
    }

    @GetMapping("/tutor/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<TutorEntity?> {
        return tutorentityService!!.find(id!!)
    }

    @get:GetMapping("/tutor")
    val all: List<TutorEntity?>
        get() = tutorentityService!!.findAll()

    @DeleteMapping("/tutor/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        tutorentityService!!.delete(id!!)
    }

    @DeleteMapping("/tutor")
    fun deleteAll() {
        tutorentityService!!.deleteAll()
    }

    @GetMapping("/tutor/count")
    fun count(): Long {
        return tutorentityService!!.count()
    }


    @GetMapping("/tutor/schedule")
    fun tutorschedule(@RequestParam tutorsName: String): Week {
        return tutorentityService!!.find(tutorsName)
    }

    @GetMapping("/tutor/search")
    fun tutorsList(@RequestParam tutorsName: String): List<TutorEntity?> {
        return tutorentityService!!.findTutors(tutorsName)
    }
}