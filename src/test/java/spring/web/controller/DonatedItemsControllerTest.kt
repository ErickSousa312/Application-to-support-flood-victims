package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import spring.commons.DonateItemsConstains.ItemsValid
import spring.domain.services.DonatedItemsService

class DonatedItemsControllerTest () {

    private lateinit var donatedItemsService: DonatedItemsService

    @BeforeEach
    fun setup (){
        val service = DonatedItemsService()
        donatedItemsService = service
    }

    @Test
    fun testDonatedItemsController() {
        val donatedItemsController = DonatedItemsController()
        val result = donatedItemsController.insert(ItemsValid)
        assertThat(result.id).isNotNull()
    }
}