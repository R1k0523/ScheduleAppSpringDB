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

    @OneToOne(cascade = [CascadeType.MERGE])
    var user: UsersEntity? = null

    @OneToMany(cascade = [CascadeType.MERGE])
    var lessons: List<LessonEntity>? = null

    fun toModel():ShortScheduleModel = ShortScheduleModel(schedulesId, schedulesName, lessons!!.size)
    fun toFull(): FullScheduleModel = FullScheduleModel(schedulesId, schedulesName, lessons)
}

class ShortScheduleModel(
    var schedulesId: Long? = null,
    var schedulesName: String? = null,
    var lessonsCount: Int = 0
)

class FullScheduleModel(
    var schedulesId: Long? = null,
    var schedulesName: String? = null,
    fullLessons: List<LessonEntity>? = null
) {
    var oddWeekLessons: ArrayList<LessonEntity> = arrayListOf()
    var evenWeekLessons: ArrayList<LessonEntity> = arrayListOf()
    init {
        fullLessons!!.forEach {
            if (it.interval?.intervalId?.week == 0) {
                evenWeekLessons.add(it)
            } else {
                oddWeekLessons.add(it)
            }
        }
    }
}