package spring.domain.shelter

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.NotNull

@Entity
class Shelter(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @NotNull
    var name: String? = null,

    var addr: String? = null,

    var responsible: String? = null,

    var phone: String? = null,

    var contact_email: String? = null
)