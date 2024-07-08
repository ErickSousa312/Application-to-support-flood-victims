package spring.domain.services

import jakarta.persistence.EntityManager
import jakarta.validation.Validation
import jakarta.validation.Validator
import spring.domain.model.donatedItems.DonatedItems
import spring.domain.repository.DonatedItemsRepository
import spring.utils.Jpa

class DonatedItemsService : DonatedItemsRepository{

    private var entity: EntityManager = Jpa.getEntityManager()

    private val validator: Validator = Validation.buildDefaultValidatorFactory().validator

    override fun save(donatedItems: DonatedItems): DonatedItems {
        entity.transaction.begin()
        entity.persist(donatedItems)
        entity.transaction.commit()
        println(donatedItems)
        return donatedItems
    }

    override fun findById(id: Long?): DonatedItems? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<DonatedItems?>? {
        TODO("Not yet implemented")
    }

    override fun update(user: DonatedItems?) {
        TODO("Not yet implemented")
    }

    override fun delete(id: DonatedItems?) {
        TODO("Not yet implemented")
    }


}