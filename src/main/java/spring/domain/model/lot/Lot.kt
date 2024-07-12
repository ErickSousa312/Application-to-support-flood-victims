package spring.domain.model.lot

import jakarta.persistence.*
import spring.domain.model.donatedItems.DonatedItem
import java.util.*

@Entity
@Table(name = "lot")
data class Lot(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    @OneToMany(
        mappedBy = "lotId",
        cascade = [(CascadeType.ALL)],
    )
    var donatedItemId: MutableSet<DonatedItem>? = HashSet(),
    @Column(name = "distribution_center")
    var distributionCenter: Long? = 0,
    @Column(name = "send_date")
    var sendDate: Date? = Date(),
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Lot

        return id == other.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}