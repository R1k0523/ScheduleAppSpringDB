package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.CampusEntity
import java.util.*

interface CampusEntityRepository : JpaRepository<CampusEntity?, Long?> {
    fun findByCampusName(name: String): Optional<CampusEntity>
}