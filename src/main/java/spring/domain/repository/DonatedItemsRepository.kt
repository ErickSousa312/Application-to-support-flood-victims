package spring.domain.repository

import spring.domain.model.donatedItems.DonatedItems

interface DonatedItemsRepository {
    fun findById(id: Long?): DonatedItems?
    fun findAll(): List<DonatedItems?>?
    fun save(donatedItems: DonatedItems): DonatedItems
    fun update(user: DonatedItems?)
    fun delete(id: DonatedItems?)
}
