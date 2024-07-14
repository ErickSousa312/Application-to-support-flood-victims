package spring.web.controller

import spring.domain.model.item.Item
import spring.domain.services.ItemService
import spring.web.dto.ItemDTO

class ItemController {
    companion object {
        private val itemService: ItemService = ItemService()

        fun insert (item : Item) : Item {
            return itemService.save(item)
        }

        fun findById(itemId : Long) : Item? {
            return itemService.findById(itemId)
        }

        fun findAll() : MutableList<ItemDTO> {
            val items = itemService.findAll()?:return emptyList<ItemDTO>().toMutableList()
            return items.map { ItemDTO(it) }.toMutableList()
        }
    }
}