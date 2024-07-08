package spring.web.controller

import org.junit.jupiter.api.Test
import spring.commons.DonateItemsConstains.ItemsValid

class DonatedItemsControllerTest (
//    private val donatedItemsController: DonatedItemsController
) {
    @Test
    fun testDonatedItemsController() {
        val donatedItemsController = DonatedItemsController()
        donatedItemsController.insert(ItemsValid)

    }
}