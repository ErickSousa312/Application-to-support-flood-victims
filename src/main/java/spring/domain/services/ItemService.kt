package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.item.Item
import spring.domain.repository.ItemRepository
import spring.utils.Jpa

class ItemService: ItemRepository {

    private val entity: EntityManager = Jpa.getEntityManager()


    override fun findById(id: Long): Item? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Item?>? {
        val query: String = "select c from Item c"
        return entity.createQuery(query, Item::class.java).resultList
    }

    override fun save(entity: Item): Item {
        this.entity.transaction.begin()
        this.entity.persist(entity)
        this.entity.transaction.commit()
        return entity
    }

    override fun update(user: Item?) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }
}