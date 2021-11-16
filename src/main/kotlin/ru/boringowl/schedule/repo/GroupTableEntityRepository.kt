package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.GroupTableEntity

interface GroupTableEntityRepository : JpaRepository<GroupTableEntity?, Long?>