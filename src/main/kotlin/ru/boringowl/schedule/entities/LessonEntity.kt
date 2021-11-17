package ru.boringowl.schedule.entities

import ru.boringowl.schedule.entities.*
import javax.persistence.*

@Entity
@Table(name = "lesson")
class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lesson_id", nullable = false)
    var lessonId: Long? = null

    
    @Column(name = "lesson_type", nullable = false)
    var lessonType: String? = null

    @ManyToOne(cascade = [CascadeType.ALL])
    var subject: SubjectEntity? = null
    @ManyToOne(cascade = [CascadeType.ALL])
    var classroom: ClassroomEntity? = null
    @ManyToOne(cascade = [CascadeType.ALL])
    var tutor: TutorEntity? = null
    @ManyToOne(cascade = [CascadeType.MERGE])
    var group: GroupTableEntity? = null
    @ManyToOne(cascade = [CascadeType.MERGE])
    var interval: IntervalTableEntity? = null
}

