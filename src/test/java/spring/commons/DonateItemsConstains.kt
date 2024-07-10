package spring.commons

import spring.domain.model.donatedItems.DonatedItem
import java.text.SimpleDateFormat

object DonateItemsConstains {

    private val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    private val dateString = "2023-12-25"

    private val date1 = dateFormat.parse(dateString)

    val ItemsValid: DonatedItem = DonatedItem(
        null,
        1,
        1,
        "anyone description",
        50,
        date1,
        )
    val ItemsValid2: DonatedItem = DonatedItem(
        null,
        2,
        2,
        "anyone description",
        50,
        date1,
        )
    val ItemsInvalid: DonatedItem = DonatedItem()
}