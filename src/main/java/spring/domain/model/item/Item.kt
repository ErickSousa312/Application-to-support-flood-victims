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
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Item

        if (id != other.id) return false
        if (typeId != other.typeId) return false
        if (type != other.type) return false
        if (description != other.description) return false
        if (gender != other.gender) return false
        if (size != other.size) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (typeId ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (gender?.hashCode() ?: 0)
        result = 31 * result + (size?.hashCode() ?: 0)
        return result
    }
}