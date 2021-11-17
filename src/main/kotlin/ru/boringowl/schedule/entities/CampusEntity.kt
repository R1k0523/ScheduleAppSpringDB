package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "campus")
class CampusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campus_id", nullable = false)
    var campusId: Long? = null

    @Column(name = "campus_name", nullable = false)
    var campusName: String? = null
}

