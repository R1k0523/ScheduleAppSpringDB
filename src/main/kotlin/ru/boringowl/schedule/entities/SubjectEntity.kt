package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "subject", uniqueConstraints=[javax.persistence.UniqueConstraint(columnNames = ["subject_name"])])
class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id", nullable = false)
    var subjectId: Long? = null

    @Column(name = "subject_name", nullable = false)
    var subjectName: String? = null
}

