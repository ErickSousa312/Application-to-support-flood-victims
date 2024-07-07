package spring.domain.shelterStock

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
data class ShelterStock (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(name = "shelter_id")
    var shelterId: Long? = null,
    @Column(name = "item_id")
    var itemId: String? = null,
    @Column(name = "expiration_date")
    var expirationDate : LocalDate? = null,
    var quantity : Int? = null,
)
