package spring.commons

import spring.domain.model.donatedItems.DonatedItems
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

object DonateItemsConstains {

    private val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    private val dateString = "2023-12-25"

    private val date1 = dateFormat.parse(dateString)

    val ItemsValid: DonatedItems = DonatedItems(
        null,
        1,
        1,
        "anyone description",
        50,
        date1,
        )
    val ItemsInvalid: DonatedItems = DonatedItems()
}