package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.TutorEntity
import java.util.*

interface TutorEntityRepository : JpaRepository<TutorEntity?, Long?> {
    fun findTutorEntityByFullName(name: String): Optional<TutorEntity>
}