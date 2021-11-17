package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.EquipmentEntity
import java.util.*

interface EquipmentEntityRepository : JpaRepository<EquipmentEntity?, Long?> {
    fun findEquipmentEntityByEquipmentName(name: String): Optional<EquipmentEntity>
}