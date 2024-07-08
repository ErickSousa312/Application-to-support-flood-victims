package spring.domain.model.stock

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate
import java.util.*

@Entity
data class Stock (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,

    @Column(name = "distribution_center_id")
    var distributionCenterId : Int? = null,

    var itemId : Int? = null,

    @Column(name = "expiration_date")
    var expirationDate : LocalDate? = null,

    var quantity : Int? = null,
)