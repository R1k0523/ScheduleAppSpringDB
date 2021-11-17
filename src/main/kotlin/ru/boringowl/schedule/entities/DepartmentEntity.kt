package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "department")
class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    var departmentId: Long? = null

    @Column(name = "department_name", nullable = false)
    var departmentName: String? = null

    @OneToOne(cascade = [CascadeType.ALL])
    var campus: CampusEntity? = null
}

