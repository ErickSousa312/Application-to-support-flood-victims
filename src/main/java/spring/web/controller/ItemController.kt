package spring.web.controller

import spring.domain.model.item.Item
import spring.domain.services.ItemService

class ItemController {
    companion object {
        private val itemService: ItemService = ItemService()

        fun insert (item : Item) : Item {
            return itemService.save(item)
        }

        fun findById(itemId : Long) : Item? {
            return itemService.findById(itemId)
        }
    }
}