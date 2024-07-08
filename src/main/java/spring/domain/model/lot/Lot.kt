package spring.domain.model.lot

import jakarta.persistence.*
import java.util.*

@Entity
data class Lot (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    @Column(name = "donated_item_id")
    var donatedItemId: Long? = 0,
    @Column(name = "distribution_center")
    var distributionCenter: Long? = 0,
    @Column(name = "send_date")
    var sendDate: Date? = Date(),
)