package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.DepartmentEntity
import ru.boringowl.schedule.service.DepartmentEntityService
import java.util.*

@RestController
@RequestMapping("api")
class DepartmentEntityController {
    @Autowired
    private val departmententityService: DepartmentEntityService? = null
    @PostMapping("/department")
    fun save(@RequestBody departmententity: DepartmentEntity?): DepartmentEntity {
        return departmententityService!!.save(departmententity!!)
    }

    @GetMapping("/department/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<DepartmentEntity?> {
        return departmententityService!!.find(id!!)
    }

    @get:GetMapping("/department")
    val all: List<DepartmentEntity?>
        get() = departmententityService!!.findAll()

    @DeleteMapping("/department/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        departmententityService!!.delete(id!!)
    }

    @DeleteMapping("/department")
    fun deleteAll() {
        departmententityService!!.deleteAll()
    }

    @GetMapping("/department/count")
    fun count(): Long {
        return departmententityService!!.count()
    }
}