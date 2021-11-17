package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "speciality", uniqueConstraints=[javax.persistence.UniqueConstraint(columnNames = ["speciality_name"])])
class SpecialityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "speciality_id", nullable = false)
    var specialityId: Long? = null

    @Column(name = "speciality_name", nullable = true)
    var specialityName: String? = null
}

