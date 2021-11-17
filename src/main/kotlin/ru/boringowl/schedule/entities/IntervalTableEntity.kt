package ru.boringowl.schedule.entities

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "interval_table", uniqueConstraints=[UniqueConstraint(columnNames = ["lesson_number", "week_day", "week"])]
)
class IntervalTableEntity : Serializable {
    @EmbeddedId
    var intervalId: IntervalId? = null
}

@Embeddable
class IntervalId(
    @Column(name = "lesson_number", nullable = false)
    var lessonNumber: Int? = null,

    @Column(name = "week_day", nullable = false)
    var weekDay: Int? = null,

    @Column(name = "week", nullable = false)
    var week: Int? = null,
): Serializable