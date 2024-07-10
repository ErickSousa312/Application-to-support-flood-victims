package spring.domain.model.orderCenter

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "order_center")
data class OrderCenter (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "center_id")
    var centerId: Int? = null,
    @Column(name = "item_id")
    var itemId: Int? = null,
    @Column(name = "shelter_id")
    var shelterId: Int? = null,
    var status: String? = null,
    @Column(name = "reason_refusal")
    var reasonRefusal: String? = null,
    @Column(name = "description")
    var quantityRequested: Int? = null,
    var date: Date? = null,
)