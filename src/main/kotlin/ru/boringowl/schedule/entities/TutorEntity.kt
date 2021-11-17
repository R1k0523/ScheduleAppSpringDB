package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "tutor")
class TutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutor_id", nullable = false)
    var tutorId: Long? = null

    @Column(name = "full_name")
    var fullName: String? = null

    @OneToMany(cascade = [CascadeType.ALL])
    var position: List<PositionsEntity>? = null

    @OneToOne(cascade = [CascadeType.ALL])
    var department: DepartmentEntity? = null
}

