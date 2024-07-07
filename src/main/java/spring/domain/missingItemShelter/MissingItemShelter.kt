package spring.domain.missingItemShelter

import jakarta.persistence.*

@Entity
data class MissingItemShelter (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    @Column(name = "item_id")
    var itemId: Long? = null,
    @Column(name = "shelter_id")
    var shelterId: Long? = null,
    var quantity: Long? = null,
    var description: String? = null,
)