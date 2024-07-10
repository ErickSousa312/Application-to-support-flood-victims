package spring.web.controller

import spring.domain.model.lot.Lot
import spring.domain.services.LotService

class LotController {
    companion object {
        private val LotService:LotService = LotService()

        fun insert (lot: Lot):Lot{
            return LotService.save(lot)
        }
    }
}