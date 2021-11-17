package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "classroom", uniqueConstraints=[javax.persistence.UniqueConstraint(columnNames = ["classroom_name"])])
class ClassroomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroom_id", nullable = false)
    var classroomId: Long? = null

    @Column(name = "classroom_name")
    var classroomName: String? = null

    @Column(name = "classroom_size", nullable = false)
    var classroomSize: Int? = null

    @ManyToMany(cascade = [CascadeType.MERGE])
    var equips: List<EquipmentEntity>? = null
}

