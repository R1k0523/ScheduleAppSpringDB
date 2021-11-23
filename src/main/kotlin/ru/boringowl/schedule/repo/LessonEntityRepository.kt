package ru.boringowl.schedule.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.boringowl.schedule.entities.*
import java.util.*

interface LessonEntityRepository : JpaRepository<LessonEntity?, Long?> {
    fun findFirstByIntervalAndTutorAndSubject(
        interval: IntervalTableEntity,
        tutor: TutorEntity,
        subject: SubjectEntity
    ): Optional<LessonEntity>

    fun findByTutor(tutor: TutorEntity): List<LessonEntity>
}