package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.PositionsEntity
import ru.boringowl.schedule.service.PositionsEntityService
import java.util.*

@RestController
@RequestMapping("api")
class PositionsEntityController {
    @Autowired
    private val positionsentityService: PositionsEntityService? = null
    @PostMapping("/positions")
    fun save(@RequestBody positionsentity: PositionsEntity?): PositionsEntity {
        return positionsentityService!!.save(positionsentity!!)
    }

    @GetMapping("/positions/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<PositionsEntity?> {
        return positionsentityService!!.find(id!!)
    }

    @get:GetMapping("/positions")
    val all: List<PositionsEntity?>
        get() = positionsentityService!!.findAll()

    @DeleteMapping("/positions/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        positionsentityService!!.delete(id!!)
    }

    @DeleteMapping("/positions")
    fun deleteAll() {
        positionsentityService!!.deleteAll()
    }

    @GetMapping("/positions/count")
    fun count(): Long {
        return positionsentityService!!.count()
    }
}