package spring.domain.model.transferenceItem

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "transference_item")
data class TransferenceItem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(name = "transference_type")
    var transferenceType: Int? = null,
    @Column(name = "origin_id")
    var originId: Int? = null,
    @Column(name = "destination_id")
    var destinationId: Int? = null,
    @Column(name = "item_id")
    var itemId: Int? = null,
    var quantity: Int? = null,
    @Column(name = "transference_data")
    var transferenceData: Date? = null
)