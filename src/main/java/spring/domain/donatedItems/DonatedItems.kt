package spring.domain.donatedItems

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.Length

@Entity
@Table(name = "donated_items")
data class DonatedItems(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = 0 ,
    @field:NotBlank
    @field:NotNull
    @field:Size(max = 150)
    var type: String?= null,
    @field:NotBlank
    @field:Size(min = 1)
    @field:NotNull
    var name: String? = null
)