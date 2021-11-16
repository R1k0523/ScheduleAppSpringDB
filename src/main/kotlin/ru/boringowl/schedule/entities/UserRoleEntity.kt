package ru.boringowl.schedule.entities

import ru.boringowl.schedule.entities.UsersEntity
import javax.persistence.*

@Entity
@Table(name = "userrole")
class UserRoleEntity {
    @Id
    @Column(name = "userrole_id", nullable = false)
    var userRoleId: Long? = null

    @Column(name = "userrole_name", nullable = false)
    var userRoleName: String? = null

    @ManyToMany
    var credentials: List<CredentialEntity>? = null
}

