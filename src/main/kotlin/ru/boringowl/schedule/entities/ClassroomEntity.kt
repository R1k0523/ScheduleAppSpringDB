package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "classroom")
class ClassroomEntity {
    @Id
    @Column(name = "classroom_id", nullable = false)
    var classroomId: Long? = null

    @Column(name = "classroom_name", nullable = false)
    var classroomName: String? = null

    @Column(name = "classroom_size", nullable = false)
    var classroomSize: Int? = null

    @ManyToMany()
    var equips: List<EquipmentEntity>? = null
}

