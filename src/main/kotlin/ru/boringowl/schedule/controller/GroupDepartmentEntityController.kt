package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.GroupDepartmentEntity
import ru.boringowl.schedule.service.GroupDepartmentEntityService
import java.util.*

@RestController
@RequestMapping("api")
class GroupDepartmentEntityController {
    @Autowired
    private val groupdepartmententityService: GroupDepartmentEntityService? = null
    @PostMapping("/groupdepartment")
    fun save(@RequestBody groupdepartmententity: GroupDepartmentEntity?): GroupDepartmentEntity {
        return groupdepartmententityService!!.save(groupdepartmententity!!)
    }

    @GetMapping("/groupdepartment/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<GroupDepartmentEntity?> {
        return groupdepartmententityService!!.find(id!!)
    }

    @get:GetMapping("/groupdepartment")
    val all: List<GroupDepartmentEntity?>
        get() = groupdepartmententityService!!.findAll()

    @DeleteMapping("/groupdepartment/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        groupdepartmententityService!!.delete(id!!)
    }

    @DeleteMapping("/groupdepartment")
    fun deleteAll() {
        groupdepartmententityService!!.deleteAll()
    }

    @GetMapping("/groupdepartment/count")
    fun count(): Long {
        return groupdepartmententityService!!.count()
    }
}