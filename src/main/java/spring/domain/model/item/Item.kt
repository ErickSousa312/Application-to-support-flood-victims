package spring.domain.model.item

import jakarta.persistence.*

@Entity
@Table(name = "item")
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