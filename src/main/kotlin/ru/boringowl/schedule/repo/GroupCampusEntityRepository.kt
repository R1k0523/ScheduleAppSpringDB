package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.GroupCampusEntity

interface GroupCampusEntityRepository : JpaRepository<GroupCampusEntity?, Long?>