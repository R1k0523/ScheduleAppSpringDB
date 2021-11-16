package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.ClassroomEntity

interface ClassroomEntityRepository : JpaRepository<ClassroomEntity?, Long?>