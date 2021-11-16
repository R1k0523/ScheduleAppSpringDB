package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.GroupCampusEntity
import ru.boringowl.schedule.service.GroupCampusEntityService
import java.util.*

@RestController
@RequestMapping("api")
class GroupCampusEntityController {
    @Autowired
    private val groupcampusentityService: GroupCampusEntityService? = null
    @PostMapping("/groupcampus")
    fun save(@RequestBody groupcampusentity: GroupCampusEntity?): GroupCampusEntity {
        return groupcampusentityService!!.save(groupcampusentity!!)
    }

    @GetMapping("/groupcampus/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<GroupCampusEntity?> {
        return groupcampusentityService!!.find(id!!)
    }

    @get:GetMapping("/groupcampus")
    val all: List<GroupCampusEntity?>
        get() = groupcampusentityService!!.findAll()

    @DeleteMapping("/groupcampus/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        groupcampusentityService!!.delete(id!!)
    }

    @DeleteMapping("/groupcampus")
    fun deleteAll() {
        groupcampusentityService!!.deleteAll()
    }

    @GetMapping("/groupcampus/count")
    fun count(): Long {
        return groupcampusentityService!!.count()
    }
}