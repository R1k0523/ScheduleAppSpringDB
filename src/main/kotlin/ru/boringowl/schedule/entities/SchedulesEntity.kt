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
    var oddWeekLessons: Week = Week()
    var evenWeekLessons: Week = Week()
    init {
        fullLessons!!.forEach {
            if (it.interval?.intervalId?.week == 0) {
                when(it.interval?.intervalId?.weekDay) {
                    0 -> evenWeekLessons.mon.add(it)
                    1 -> evenWeekLessons.tue.add(it)
                    2 -> evenWeekLessons.wed.add(it)
                    3 -> evenWeekLessons.thu.add(it)
                    4 -> evenWeekLessons.fri.add(it)
                    5 -> evenWeekLessons.sat.add(it)
                }
            } else {
                when(it.interval?.intervalId?.weekDay) {
                    0 -> oddWeekLessons.mon.add(it)
                    1 -> oddWeekLessons.tue.add(it)
                    2 -> oddWeekLessons.wed.add(it)
                    3 -> oddWeekLessons.thu.add(it)
                    4 -> oddWeekLessons.fri.add(it)
                    5 -> oddWeekLessons.sat.add(it)
                }
            }
        }
    }
}

class Week(
    var mon: ArrayList<LessonEntity> = arrayListOf(),
    var tue: ArrayList<LessonEntity> = arrayListOf(),
    var wed: ArrayList<LessonEntity> = arrayListOf(),
    var thu: ArrayList<LessonEntity> = arrayListOf(),
    var fri: ArrayList<LessonEntity> = arrayListOf(),
    var sat: ArrayList<LessonEntity> = arrayListOf()
)