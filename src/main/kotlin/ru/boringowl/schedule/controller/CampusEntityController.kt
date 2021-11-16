package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.CampusEntity
import ru.boringowl.schedule.service.CampusEntityService
import java.util.*

@RestController
@RequestMapping("api")
class CampusEntityController {
    @Autowired
    private val campusentityService: CampusEntityService? = null
    @PostMapping("/campus")
    fun save(@RequestBody campusentity: CampusEntity?): CampusEntity {
        return campusentityService!!.save(campusentity!!)
    }

    @GetMapping("/campus/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<CampusEntity?> {
        return campusentityService!!.find(id!!)
    }

    @get:GetMapping("/campus")
    val all: List<CampusEntity?>
        get() = campusentityService!!.findAll()

    @DeleteMapping("/campus/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        campusentityService!!.delete(id!!)
    }

    @DeleteMapping("/campus")
    fun deleteAll() {
        campusentityService!!.deleteAll()
    }

    @GetMapping("/campus/count")
    fun count(): Long {
        return campusentityService!!.count()
    }
}