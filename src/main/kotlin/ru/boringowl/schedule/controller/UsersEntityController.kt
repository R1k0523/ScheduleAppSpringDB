package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.UsersEntity
import ru.boringowl.schedule.service.UsersEntityService
import java.util.*

@RestController
@RequestMapping("api")
class UsersEntityController {
    @Autowired
    private val usersentityService: UsersEntityService? = null
    @PostMapping("/users")
    fun save(@RequestBody usersentity: UsersEntity?): UsersEntity {
        return usersentityService!!.save(usersentity!!)
    }

    @GetMapping("/users/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<UsersEntity?> {
        return usersentityService!!.find(id!!)
    }

    @get:GetMapping("/users")
    val all: List<UsersEntity?>
        get() = usersentityService!!.findAll()

    @DeleteMapping("/users/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        usersentityService!!.delete(id!!)
    }

    @DeleteMapping("/users")
    fun deleteAll() {
        usersentityService!!.deleteAll()
    }

    @GetMapping("/users/count")
    fun count(): Long {
        return usersentityService!!.count()
    }
}