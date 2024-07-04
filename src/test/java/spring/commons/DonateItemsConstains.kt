package spring.commons

import spring.domain.donatedItems.DonatedItems

object DonateItemsConstains {
    val ItemsValid: DonatedItems = DonatedItems(null, "Frauda", "leite")
    val ItemsInvalid: DonatedItems = DonatedItems()
}