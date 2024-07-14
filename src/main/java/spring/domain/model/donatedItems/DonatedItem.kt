package spring.domain.model.donatedItems

import jakarta.persistence.*
import spring.domain.model.item.Item
import spring.domain.model.lot.Lot
import java.util.*

@Entity
@Table(name = "donated_items")
data class DonatedItem(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = 0,

//    @field:NotBlank
//    @field:NotNull
//    @field:Size(max = 150)
    @ManyToOne(cascade=[(CascadeType.ALL)])
    @JoinColumn(name = "lot_id", unique = false, nullable = true)
    var lotId: Lot? = null,

//    @field:NotBlank
//    @field:Size(min = 1)
//    @field:NotNull
    @ManyToOne
    @JoinColumn(name = "item_id", unique = false)
    var item: Item? = null,
    var description: String? = null,
    var quantity: Long? = null,
    @Column(name = "expiration_date")
    var expirationDate: Date? = null,
)