package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "users")
class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id", nullable = false)
    var usersId: Long? = null
    
    @Column(name = "login", nullable = false)
    var login: String? = null

    @Column(name = "password", nullable = false)
    var password: String? = null

    @Column(name = "email", nullable = false)
    var email: String? = null

    @Column(name = "users_name", nullable = false)
    var usersName: String? = null

    @OneToMany(cascade = [CascadeType.ALL])
    var roles: List<UserRoleEntity>? = null

}

