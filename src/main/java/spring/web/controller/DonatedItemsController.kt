package spring.web.controller

import spring.domain.model.donatedItems.DonatedItems
import spring.domain.services.DonatedItemsService

class DonatedItemsController  {

    private val donatedItemsService: DonatedItemsService = DonatedItemsService()

    fun insert (donatedItems: DonatedItems):DonatedItems{
        return donatedItemsService.save(donatedItems)
    }
}