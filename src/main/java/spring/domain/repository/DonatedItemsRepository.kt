package spring.domain.repository

import spring.domain.model.donatedItems.DonatedItem

interface DonatedItemsRepository {
    fun findById(id: Long?): DonatedItem?
    fun findAll(): List<DonatedItem?>?
    fun save(donatedItems: DonatedItem): DonatedItem
    fun update(user: DonatedItem?)
    fun delete(id: DonatedItem?)
}
