package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.PositionsEntity
import java.util.*

interface PositionsEntityRepository : JpaRepository<PositionsEntity?, Long?> {
    fun findPositionsEntityByPositionsName(name: String): Optional<PositionsEntity>
}