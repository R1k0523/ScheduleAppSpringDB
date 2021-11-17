package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.GroupTableEntity
import java.util.*

interface GroupTableEntityRepository : JpaRepository<GroupTableEntity?, String?> {
    fun findGroupTableEntityByGroupNumber(name: String): Optional<GroupTableEntity>
}