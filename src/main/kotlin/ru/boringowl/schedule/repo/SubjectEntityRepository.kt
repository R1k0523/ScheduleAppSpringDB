package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.SubjectEntity
import java.util.*

interface SubjectEntityRepository : JpaRepository<SubjectEntity?, Long?> {
    fun findSubjectEntityBySubjectName(name: String): Optional<SubjectEntity>
}