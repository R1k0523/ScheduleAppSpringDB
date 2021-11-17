package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.DepartmentEntity
import java.util.*

interface DepartmentEntityRepository : JpaRepository<DepartmentEntity?, Long?> {
    fun findDepartmentEntityByDepartmentName(name: String): Optional<DepartmentEntity>
}