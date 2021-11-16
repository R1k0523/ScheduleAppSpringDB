package ru.boringowl.schedule.entities

import ru.boringowl.schedule.entities.*
import javax.persistence.*

@Entity
@Table(name = "lesson")
class LessonEntity {
    @Id
    @Column(name = "lesson_id", nullable = false)
    var lessonId: Long? = null

    
    @Column(name = "lesson_type", nullable = false)
    var lessonType: String? = null

    @OneToOne(cascade = [CascadeType.MERGE])
    var subject: SubjectEntity? = null
    @OneToOne(cascade = [CascadeType.MERGE])
    var classroom: ClassroomEntity? = null
    @OneToOne(cascade = [CascadeType.MERGE])
    var tutor: TutorEntity? = null
    @OneToOne(cascade = [CascadeType.MERGE])
    var group: GroupTableEntity? = null
    @OneToOne(cascade = [CascadeType.MERGE])
    var lesson: LessonEntity? = null
    @OneToOne(cascade = [CascadeType.MERGE])
    var interval: IntervalTableEntity? = null
}

