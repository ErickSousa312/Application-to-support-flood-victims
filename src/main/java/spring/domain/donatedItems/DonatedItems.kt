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
    @NotBlank
    @field:NotNull
    @field:Size(max = 1)
    var type: String?= null,
    @NotBlank @Size(min = 5)
    @field:NotNull
    var name: String? = null
)