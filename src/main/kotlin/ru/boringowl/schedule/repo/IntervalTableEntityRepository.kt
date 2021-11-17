package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.IntervalId
import ru.boringowl.schedule.entities.IntervalTableEntity
import java.util.*

interface IntervalTableEntityRepository : JpaRepository<IntervalTableEntity?, Long?> {
    fun findByIntervalId(id: IntervalId): Optional<IntervalTableEntity>
}