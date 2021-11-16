package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.CampusEntity

interface CampusEntityRepository : JpaRepository<CampusEntity?, Long?>