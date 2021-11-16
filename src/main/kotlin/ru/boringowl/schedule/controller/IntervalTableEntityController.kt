package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.IntervalTableEntity
import ru.boringowl.schedule.service.IntervalTableEntityService
import java.util.*

@RestController
@RequestMapping("api")
class IntervalTableEntityController {
    @Autowired
    private val intervaltableentityService: IntervalTableEntityService? = null
    @PostMapping("/interval")
    fun save(@RequestBody intervaltableentity: IntervalTableEntity?): IntervalTableEntity {
        return intervaltableentityService!!.save(intervaltableentity!!)
    }

    @GetMapping("/interval/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<IntervalTableEntity?> {
        return intervaltableentityService!!.find(id!!)
    }

    @get:GetMapping("/interval")
    val all: List<IntervalTableEntity?>
        get() = intervaltableentityService!!.findAll()

    @DeleteMapping("/interval/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        intervaltableentityService!!.delete(id!!)
    }

    @DeleteMapping("/interval")
    fun deleteAll() {
        intervaltableentityService!!.deleteAll()
    }

    @GetMapping("/interval/count")
    fun count(): Long {
        return intervaltableentityService!!.count()
    }
}