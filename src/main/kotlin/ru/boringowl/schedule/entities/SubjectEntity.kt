package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "subject")
class SubjectEntity {
    @Id
    @Column(name = "subject_id", nullable = false)
    var subjectId: Long? = null

    @Column(name = "subject_name", nullable = false)
    var subjectName: String? = null
}

