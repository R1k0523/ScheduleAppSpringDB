package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.CampusEntity
import ru.boringowl.schedule.entities.ClassroomEntity
import java.util.*

interface ClassroomEntityRepository : JpaRepository<ClassroomEntity?, Long?> {
    fun findClassroomEntityByClassroomName(name: String): Optional<ClassroomEntity>
}