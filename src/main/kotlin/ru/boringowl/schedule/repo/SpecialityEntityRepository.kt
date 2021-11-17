package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.SpecialityEntity
import java.util.*

interface SpecialityEntityRepository : JpaRepository<SpecialityEntity?, Long?> {
    fun findSpecialityEntityBySpecialityName(name: String): Optional<SpecialityEntity>
}