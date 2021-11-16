package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "positions")
class PositionsEntity {
    @Id
    @Column(name = "positions_id", nullable = false)
    var positionsId: Long? = null

    
    @Column(name = "positions_name", nullable = false)
    var positionsName: String? = null

    
    @Column(name = "work_time", nullable = false)
    var workTime: Int? = null
}

