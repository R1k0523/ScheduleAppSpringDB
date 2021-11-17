package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "department", uniqueConstraints=[javax.persistence.UniqueConstraint(columnNames = ["department_name"])])
class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    var departmentId: Long? = null

    @Column(name = "department_name", nullable = false)
    var departmentName: String? = null

    @ManyToOne(cascade = [CascadeType.MERGE])
    var campus: CampusEntity? = null
}

