package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.SpecialityEntity

interface SpecialityEntityRepository : JpaRepository<SpecialityEntity?, Long?>