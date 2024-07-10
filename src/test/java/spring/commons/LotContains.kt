package spring.commons

import spring.domain.model.lot.Lot
import java.text.SimpleDateFormat
import java.util.*

object LotContains {

    private val formatterDate =  SimpleDateFormat("yyyy-MM-dd")
    private val dataString = "2024-07-08"
    private val date: Date = formatterDate.parse(dataString)

    val LotValid = Lot(null,1,2,date)

}