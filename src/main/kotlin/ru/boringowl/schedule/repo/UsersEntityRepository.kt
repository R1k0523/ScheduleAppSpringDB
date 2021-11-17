package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.UsersEntity
import java.util.*

interface UsersEntityRepository : JpaRepository<UsersEntity?, Long?> {
    fun findUsersEntityByLogin(login: String): Optional<UsersEntity>
}