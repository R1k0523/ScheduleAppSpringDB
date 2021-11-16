package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "department")
class DepartmentEntity {
    @Id
    @Column(name = "department_id", nullable = false)
    var departmentId: Long? = null

    @Column(name = "department_name", nullable = false)
    var departmentName: String? = null

    @OneToOne(cascade = [CascadeType.MERGE])
    var campus: CampusEntity? = null
}

