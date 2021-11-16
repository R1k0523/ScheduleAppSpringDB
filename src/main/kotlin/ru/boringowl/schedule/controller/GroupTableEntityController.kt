package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.GroupTableEntity
import ru.boringowl.schedule.service.GroupTableEntityService
import java.util.*

@RestController
@RequestMapping("api")
class GroupTableEntityController {
    @Autowired
    private val grouptableentityService: GroupTableEntityService? = null
    @PostMapping("/group")
    fun save(@RequestBody grouptableentity: GroupTableEntity?): GroupTableEntity {
        return grouptableentityService!!.save(grouptableentity!!)
    }

    @GetMapping("/group/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<GroupTableEntity?> {
        return grouptableentityService!!.find(id!!)
    }

    @get:GetMapping("/group")
    val all: List<GroupTableEntity?>
        get() = grouptableentityService!!.findAll()

    @DeleteMapping("/group/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        grouptableentityService!!.delete(id!!)
    }

    @DeleteMapping("/group")
    fun deleteAll() {
        grouptableentityService!!.deleteAll()
    }

    @GetMapping("/group/count")
    fun count(): Long {
        return grouptableentityService!!.count()
    }
}