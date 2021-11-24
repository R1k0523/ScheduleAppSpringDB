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

    @ManyToMany(cascade = [CascadeType.MERGE])
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
        if (fullLessons != null) {
            val weeks = ScheduleUtils.lessonsToWeeks(fullLessons)
            evenWeekLessons = weeks.first
            oddWeekLessons = weeks.second
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
) {

    fun sort() {
        mon.sortWith(compareBy {it.interval!!.intervalId!!.lessonNumber})
        tue.sortWith(compareBy {it.interval!!.intervalId!!.lessonNumber})
        wed.sortWith(compareBy {it.interval!!.intervalId!!.lessonNumber})
        thu.sortWith(compareBy {it.interval!!.intervalId!!.lessonNumber})
        fri.sortWith(compareBy {it.interval!!.intervalId!!.lessonNumber})
        sat.sortWith(compareBy {it.interval!!.intervalId!!.lessonNumber})
    }
}

object ScheduleUtils {
    fun lessonsToWeeks(lessons : List<LessonEntity>, isTwoWeeks: Boolean = true): Pair<Week, Week> {
        val odd = Week()
        val even = Week()
        lessons.forEach {
            if (it.interval?.intervalId?.week == 0 || !isTwoWeeks) {
                when(it.interval?.intervalId?.weekDay) {
                    0 -> even.mon.add(it)
                    1 -> even.tue.add(it)
                    2 -> even.wed.add(it)
                    3 -> even.thu.add(it)
                    4 -> even.fri.add(it)
                    5 -> even.sat.add(it)
                }
            } else {
                when(it.interval?.intervalId?.weekDay) {
                    0 -> odd.mon.add(it)
                    1 -> odd.tue.add(it)
                    2 -> odd.wed.add(it)
                    3 -> odd.thu.add(it)
                    4 -> odd.fri.add(it)
                    5 -> odd.sat.add(it)
                }
            }
        }
        odd.sort()
        even.sort()
        return Pair(even, odd)
    }

}