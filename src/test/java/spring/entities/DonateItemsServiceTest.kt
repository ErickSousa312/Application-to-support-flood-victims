package spring.entities

import jakarta.validation.ConstraintViolationException
import org.junit.jupiter.api.Test
import spring.dao.DonatedItemsDAO
import spring.utils.Jpa
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import spring.commons.DonateItemsConstains.ItemsInvalid
import spring.commons.DonateItemsConstains.ItemsValid
import spring.domain.donatedItems.DonatedItems

class DonateItemsServiceTest {

    private lateinit var dataBaseEntity : DonatedItemsDAO

    @BeforeEach
    fun setUp() {
        dataBaseEntity = DonatedItemsDAO(Jpa.getEntityManager())
    }

    @Test
    fun testCreateDonateItems_whenCreated_shouldReturnSuccessfully(){
        val item2 = DonatedItems()
        val savedItems = dataBaseEntity.insert(item2)
        assertThat(savedItems.id).isNotNull()
    }

    @Test
    fun testCreateDonateItems_whenCreated_shouldReturnRunTimeException(){
        val item = DonatedItems()
        assertThrows(ConstraintViolationException::class.java){
            dataBaseEntity.insert(item)
        }
    }
}