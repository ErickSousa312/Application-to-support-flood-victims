package spring.domain.model.orderCenter

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
data class OrderCenter (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "center_id")
    var centerId: String? = null,
    @Column(name = "item_id")
    var itemId: String? = null,
    @Column(name = "shelter_id")
    var shelterId: String? = null,
    var status: String? = null,
    @Column(name = "reason_refusal")
    var reasonRefusal: String? = null,
    @Column(name = "description")
    var quantityRequested: Int? = null,
    var date: Date? = null,
)