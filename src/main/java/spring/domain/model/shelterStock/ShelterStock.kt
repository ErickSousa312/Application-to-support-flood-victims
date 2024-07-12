package spring.domain.model.shelterStock

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "shelter_stock")
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
