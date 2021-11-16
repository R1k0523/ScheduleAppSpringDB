package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.CredentialEntity
import ru.boringowl.schedule.service.CredentialEntityService
import java.util.*

@RestController
@RequestMapping("api")
class CredentialEntityController {
    @Autowired
    private val credentialentityService: CredentialEntityService? = null
    @PostMapping("/credential")
    fun save(@RequestBody credentialentity: CredentialEntity?): CredentialEntity {
        return credentialentityService!!.save(credentialentity!!)
    }

    @GetMapping("/credential/{id}")
    fun getById(@PathVariable(value = "id") id: Long?): Optional<CredentialEntity?> {
        return credentialentityService!!.find(id!!)
    }

    @get:GetMapping("/credential")
    val all: List<CredentialEntity?>
        get() = credentialentityService!!.findAll()

    @DeleteMapping("/credential/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        credentialentityService!!.delete(id!!)
    }

    @DeleteMapping("/credential")
    fun deleteAll() {
        credentialentityService!!.deleteAll()
    }

    @GetMapping("/credential/count")
    fun count(): Long {
        return credentialentityService!!.count()
    }
}