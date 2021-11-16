package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.SpecialityEntity
import ru.boringowl.schedule.service.SpecialityEntityService
import java.util.*

@RestController
@RequestMapping("api")
class SpecialityEntityController {
    @Autowired
    private val specialityentityService: SpecialityEntityService? = null
    @PostMapping("/speciality")
    fun save(@RequestBody specialityentity: SpecialityEntity?): SpecialityEntity {
        return specialityentityService!!.save(specialityentity!!)
    }

    @GetMapping("/speciality/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<SpecialityEntity?> {
        return specialityentityService!!.find(id!!)
    }

    @get:GetMapping("/speciality")
    val all: List<SpecialityEntity?>
        get() = specialityentityService!!.findAll()

    @DeleteMapping("/speciality/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        specialityentityService!!.delete(id!!)
    }

    @DeleteMapping("/speciality")
    fun deleteAll() {
        specialityentityService!!.deleteAll()
    }

    @GetMapping("/speciality/count")
    fun count(): Long {
        return specialityentityService!!.count()
    }
}