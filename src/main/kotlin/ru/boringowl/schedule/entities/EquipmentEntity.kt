package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "equipment")
class EquipmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_id", nullable = false)
    var equipmentId: Long = -1

    
    @Column(name = "equipment_name", nullable = false)
    var equipmentName: String? = null

}

