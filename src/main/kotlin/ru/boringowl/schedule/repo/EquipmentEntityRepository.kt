package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.EquipmentEntity

interface EquipmentEntityRepository : JpaRepository<EquipmentEntity?, Long?>