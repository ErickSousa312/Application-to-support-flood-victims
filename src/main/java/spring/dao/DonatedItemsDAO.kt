package spring.dao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import spring.domain.model.donatedItems.DonatedItem;
import spring.utils.Jpa

open class DonatedItemsDAO() {

    private var em: EntityManager = Jpa.getEntityManager()

    private val validator: Validator = Validation.buildDefaultValidatorFactory().validator

    @Transactional
    open fun insert(donatedItems: DonatedItem): DonatedItem {
        em.transaction.begin()
        em.persist(donatedItems)
        em.transaction.commit()
        println(donatedItems)
        return donatedItems
    }

//    fun selectAll(): List<DonatedItems> {
//        val query: String = "select c from DonatedItems c"
//        return persistenceContext.createQuery(query, DonatedItems::class.java).resultList
//    }

}