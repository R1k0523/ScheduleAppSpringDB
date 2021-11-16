package ru.boringowl.schedule.entities

import javax.persistence.*

@Entity
@Table(name = "credential")
class CredentialEntity {
    @Id
    @Column(name = "credential_id", nullable = false)
    var credentialId: Long? = null

    @Column(name = "credential_name", nullable = false)
    var credentialName: String? = null

    @Column(name = "category", nullable = true)
    var category: String? = null
}
