package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "group_table")
class GroupTableEntity {
    @Id
    @Column(name = "group_number", nullable = false)
    var groupNumber: String? = null



    @OneToOne(cascade = [CascadeType.MERGE])
    var speciality: SpecialityEntity? = null

    
    @OneToOne(cascade = [CascadeType.MERGE])
    var department: DepartmentEntity? = null
}

