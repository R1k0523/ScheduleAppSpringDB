package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.SubjectEntity
import ru.boringowl.schedule.service.SubjectEntityService
import java.util.*

@RestController
@RequestMapping("api")
class SubjectEntityController {
    @Autowired
    private val subjectentityService: SubjectEntityService? = null
    @PostMapping("/subject")
    fun save(@RequestBody subjectentity: SubjectEntity?): SubjectEntity {
        return subjectentityService!!.save(subjectentity!!)
    }

    @GetMapping("/subject/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<SubjectEntity?> {
        return subjectentityService!!.find(id!!)
    }

    @get:GetMapping("/subject")
    val all: List<SubjectEntity?>
        get() = subjectentityService!!.findAll()

    @DeleteMapping("/subject/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        subjectentityService!!.delete(id!!)
    }

    @DeleteMapping("/subject")
    fun deleteAll() {
        subjectentityService!!.deleteAll()
    }

    @GetMapping("/subject/count")
    fun count(): Long {
        return subjectentityService!!.count()
    }
}