package spring.dao;

import jakarta.persistence.EntityManager;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import spring.domain.donatedItems.DonatedItems;

class DonatedItemsDAO(private val persistenceContext: EntityManager) {

    private val validator: Validator = Validation.buildDefaultValidatorFactory().validator

    fun insert(donatedItems: DonatedItems): DonatedItems {
//        val violations = validator.validate(donatedItems)
//
//        if (violations.isNotEmpty()) {
//            throw ConstraintViolationException("Validation failed for ${donatedItems.javaClass.simpleName}", violations)
//        }
        persistenceContext.transaction.begin()
        persistenceContext.persist(donatedItems)
        persistenceContext.transaction.commit()
        return donatedItems
    }

    fun selectAll(): List<DonatedItems> {
        val query: String = "select c from DonatedItems c"
        return persistenceContext.createQuery(query, DonatedItems::class.java).resultList
    }
}