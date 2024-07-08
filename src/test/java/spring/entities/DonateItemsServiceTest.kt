package spring.entities

import jakarta.persistence.RollbackException
import jakarta.validation.ConstraintViolationException
import org.junit.jupiter.api.Test
import spring.dao.DonatedItemsDAO
import spring.utils.Jpa
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import spring.commons.DonateItemsConstains.ItemsInvalid
import spring.commons.DonateItemsConstains.ItemsValid
import spring.domain.model.donatedItems.DonatedItems
import spring.domain.services.DonatedItemsService

class DonateItemsServiceTest {

    private lateinit var service : DonatedItemsService

    @BeforeEach
    fun setUp() {
        service = DonatedItemsService()
    }

    @Test
    fun testCreateDonateItems_whenCreated_shouldReturnSuccessfully(){
        val savedItems = service.save(ItemsValid)
        assertThat(savedItems.id).isNotNull()
    }

    @Test
    fun testCreateDonateItems_whenCreated_shouldReturnRollbackException(){
        assertThrows(RollbackException::class.java){
            service.save(ItemsInvalid)
        }
    }

//    @Test
//    fun testCrateDonatedItems_whenCreated_shouldReturn(){
//        val savedItems: List<DonatedItems> = dataBaseEntity.selectAll()
//        assertThat(savedItems.size).isGreaterThan(0)
//    }


}