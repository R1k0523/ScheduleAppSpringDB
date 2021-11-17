package ru.boringowl.schedule.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.boringowl.schedule.entities.FullScheduleModel
import ru.boringowl.schedule.entities.ShortScheduleModel
import ru.boringowl.schedule.entities.SchedulesEntity
import ru.boringowl.schedule.service.SchedulesEntityService
import java.util.*

@RestController
@RequestMapping("api")
class SchedulesEntityController {
    @Autowired
    private val schedulesentityService: SchedulesEntityService? = null
    @PostMapping("/schedules")
    fun save(@RequestBody schedulesentity: SchedulesEntity?): SchedulesEntity {
        return schedulesentityService!!.save(schedulesentity!!)
    }
//
//    @GetMapping("/schedules/{id}")
//    fun getById(@PathVariable(value = "id") id: Long?): Optional<SchedulesEntity?> {
//        return schedulesentityService!!.find(id!!)
//    }

//    @GetMapping("/schedules/{groupName}")
//    fun getById(@PathVariable(value = "groupName") groupName: String?): Optional<SchedulesEntity> {
//        return schedulesentityService!!.findByGroupName(groupName!!)
//    }

    @GetMapping("/schedules/{groupName}")
    fun getById(@PathVariable(value = "groupName") groupName: String?): FullScheduleModel {
        return schedulesentityService!!.findByGroupName(groupName!!).get().toFull()
    }
    @get:GetMapping("/schedules")
    val all: List<ShortScheduleModel?>
        get(): List<ShortScheduleModel?> {
            val models = arrayListOf<ShortScheduleModel>()
            schedulesentityService!!.findAll().forEach { models.add(it!!.toModel()) }
            return models
        }

    @DeleteMapping("/schedules/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long?) {
        schedulesentityService!!.delete(id!!)
    }

    @DeleteMapping("/schedules")
    fun deleteAll() {
        schedulesentityService!!.deleteAll()
    }

    @GetMapping("/schedules/count")
    fun count(): Long {
        return schedulesentityService!!.count()
    }
}