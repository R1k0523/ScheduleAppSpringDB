package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.UserRoleEntity
import java.util.*

interface UserRoleEntityRepository : JpaRepository<UserRoleEntity?, Long?> {
    fun findUserRoleEntityByUserRoleName(name: String): Optional<UserRoleEntity>
}