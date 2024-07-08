package spring.domain.model.item

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = 0,
    @Column
    var typeId: Int? = null,
    var type: String? = null,
    var description: String? = null,
    var gender: String? = null,
    var size: Long? = null,
)