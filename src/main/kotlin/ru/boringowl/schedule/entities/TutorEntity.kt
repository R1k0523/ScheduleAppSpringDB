package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "tutor")
class TutorEntity {
    @Id
    @Column(name = "tutor_id", nullable = false)
    var tutorId: Long? = null

    @Column(name = "full_name", nullable = false)
    var fullName: String? = null

    @OneToMany
    var position: List<PositionsEntity>? = null

    @OneToOne(cascade = [CascadeType.MERGE])
    var department: DepartmentEntity? = null
}

