package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "tutor", uniqueConstraints=[javax.persistence.UniqueConstraint(columnNames = ["full_name"])])
class TutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutor_id", nullable = false)
    var tutorId: Long? = null

    @Column(name = "full_name")
    var fullName: String? = null

    @ManyToMany(cascade = [CascadeType.MERGE])
    var position: List<PositionsEntity>? = null

    @ManyToOne(cascade = [CascadeType.MERGE])
    var department: DepartmentEntity? = null
}

