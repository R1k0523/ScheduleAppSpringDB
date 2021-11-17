package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "schedules")
class SchedulesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedules_id", nullable = false)
    var schedulesId: Long? = null

    
    @Column(name = "schedules_name", nullable = false)
    var schedulesName: String? = null

    @OneToOne(cascade = [CascadeType.ALL])
    var user: UsersEntity? = null

    @OneToMany(cascade = [CascadeType.ALL])
    var lessons: List<LessonEntity>? = null
}

