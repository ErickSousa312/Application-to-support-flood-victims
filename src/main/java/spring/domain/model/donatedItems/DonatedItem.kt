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
    @ManyToOne
    @JoinColumn(name = "lotId")
    var lotId: Lot? = null,

//    @field:NotBlank
//    @field:Size(min = 1)
//    @field:NotNull
    @ManyToOne()
    @JoinColumn(name = "item_id", referencedColumnName = "id", unique = false)
    var item: Item? = null,
    var description: String? = null,
    var quantity: Long? = null,
    @Column(name = "expiration_date")
    var expirationDate: Date? = null,
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DonatedItem

        if (id != other.id) return false
        if (lotId != other.lotId) return false
        if (item != other.item) return false
        if (description != other.description) return false
        if (quantity != other.quantity) return false
        if (expirationDate != other.expirationDate) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (lotId?.hashCode() ?: 0)
        result = 31 * result + (item?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (quantity?.hashCode() ?: 0)
        result = 31 * result + (expirationDate?.hashCode() ?: 0)
        return result
    }
}