package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import spring.commons.DonateItemsConstains.ItemsValid
import spring.commons.DonateItemsConstains.ItemsValid2
import spring.domain.services.DonatedItemService

class DonatedItemControllerTest () {

    private lateinit var donatedItemsService: DonatedItemService

    @BeforeEach
    fun setup (){
        val service = DonatedItemService()
        donatedItemsService = service
    }

    @Test
    fun testDonatedItemsController() {
        val result = DonatedItemsController.insert(ItemsValid)
        assertThat(result.id).isNotNull()
    }
}