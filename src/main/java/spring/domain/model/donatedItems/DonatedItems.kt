package spring.domain.model.donatedItems

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.util.*

@Entity
@Table(name = "donated_items")
data class DonatedItems(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = 0,

//    @field:NotBlank
//    @field:NotNull
//    @field:Size(max = 150)
    @Column(name = "lot_id")
    var lotId: Int? = null,

//    @field:NotBlank
//    @field:Size(min = 1)
//    @field:NotNull
    @Column(name = "item_id")
    var itemId: Int? = null,
    var description: String? = null,
    var quantity: Long? = null,
    @Column(name = "expiration_date")
    var expirationDate: Date? = null,
)