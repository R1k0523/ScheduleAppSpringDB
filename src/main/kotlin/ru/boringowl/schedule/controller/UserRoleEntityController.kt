package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.UserRoleEntity
import ru.boringowl.schedule.service.UserRoleEntityService
import java.util.*

@RestController
@RequestMapping("api")
class UserRoleEntityController {
    @Autowired
    private val userroleentityService: UserRoleEntityService? = null
    @PostMapping("/userrole")
    fun save(@RequestBody userroleentity: UserRoleEntity?): UserRoleEntity {
        return userroleentityService!!.save(userroleentity!!)
    }

    @GetMapping("/userrole/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<UserRoleEntity?> {
        return userroleentityService!!.find(id!!)
    }

    @get:GetMapping("/userrole")
    val all: List<UserRoleEntity?>
        get() = userroleentityService!!.findAll()

    @DeleteMapping("/userrole/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        userroleentityService!!.delete(id!!)
    }

    @DeleteMapping("/userrole")
    fun deleteAll() {
        userroleentityService!!.deleteAll()
    }

    @GetMapping("/userrole/count")
    fun count(): Long {
        return userroleentityService!!.count()
    }
}