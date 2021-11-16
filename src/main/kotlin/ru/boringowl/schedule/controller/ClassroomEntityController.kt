package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.ClassroomEntity
import ru.boringowl.schedule.service.ClassroomEntityService
import java.util.*

@RestController
@RequestMapping("api")
class ClassroomEntityController {
    @Autowired
    private val classroomentityService: ClassroomEntityService? = null
    @PostMapping("/classroom")
    fun save(@RequestBody classroomentity: ClassroomEntity?): ClassroomEntity {
        return classroomentityService!!.save(classroomentity!!)
    }

    @GetMapping("/classroom/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<ClassroomEntity?> {
        return classroomentityService!!.find(id!!)
    }

    @get:GetMapping("/classroom")
    val all: List<ClassroomEntity?>
        get() = classroomentityService!!.findAll()

    @DeleteMapping("/classroom/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        classroomentityService!!.delete(id!!)
    }

    @DeleteMapping("/classroom")
    fun deleteAll() {
        classroomentityService!!.deleteAll()
    }

    @GetMapping("/classroom/count")
    fun count(): Long {
        return classroomentityService!!.count()
    }
}