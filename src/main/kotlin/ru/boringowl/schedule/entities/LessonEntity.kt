package ru.boringowl.schedule.entities

import ru.boringowl.schedule.entities.*
import javax.persistence.*

@Entity
@Table(name = "lesson", uniqueConstraints=[javax.persistence.UniqueConstraint(columnNames = ["tutor_id", "interval_lesson_number","interval_week", "interval_week_day", "subject_id"])])
class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lesson_id", nullable = false)
    var lessonId: Long? = null

    
    @Column(name = "lesson_type")
    var lessonType: String? = null

    @ManyToOne(cascade = [CascadeType.MERGE])
    @JoinColumn(name="subject_id")
    var subject: SubjectEntity? = null
    @ManyToOne(cascade = [CascadeType.MERGE])
    @JoinColumn(name="classroom_id")
    var classroom: ClassroomEntity? = null
    @ManyToOne(cascade = [CascadeType.MERGE])
    @JoinColumn(name="tutor_id")
    var tutor: TutorEntity? = null
    @ManyToMany(cascade = [CascadeType.MERGE])
    var groups: List<GroupTableEntity>? = null

    @ManyToOne(cascade = [CascadeType.MERGE])
    var interval: IntervalTableEntity? = null
}

