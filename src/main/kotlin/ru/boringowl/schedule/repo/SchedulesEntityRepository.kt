package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import ru.boringowl.schedule.entities.SchedulesEntity
import java.util.*

interface SchedulesEntityRepository : JpaRepository<SchedulesEntity?, Long?> {
    fun findSchedulesEntityBySchedulesName(name: String): Optional<SchedulesEntity>
    fun findFirstBySchedulesNameEndsWith(groupName: String): Optional<SchedulesEntity>

}