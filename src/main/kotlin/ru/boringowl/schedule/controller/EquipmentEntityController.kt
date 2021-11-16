package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.EquipmentEntity
import ru.boringowl.schedule.service.EquipmentEntityService
import java.util.*

@RestController
@RequestMapping("api")
class EquipmentEntityController {
    @Autowired
    private val equipmententityService: EquipmentEntityService? = null
    @PostMapping("/equipment")
    fun save(@RequestBody equipmententity: EquipmentEntity?): EquipmentEntity {
        return equipmententityService!!.save(equipmententity!!)
    }

    @GetMapping("/equipment/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<EquipmentEntity?> {
        return equipmententityService!!.find(id!!)
    }

    @get:GetMapping("/equipment")
    val all: List<EquipmentEntity?>
        get() = equipmententityService!!.findAll()

    @DeleteMapping("/equipment/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        equipmententityService!!.delete(id!!)
    }

    @DeleteMapping("/equipment")
    fun deleteAll() {
        equipmententityService!!.deleteAll()
    }

    @GetMapping("/equipment/count")
    fun count(): Long {
        return equipmententityService!!.count()
    }
}