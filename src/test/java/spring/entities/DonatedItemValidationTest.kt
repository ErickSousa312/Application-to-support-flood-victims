package spring.entities

import jakarta.validation.Validation
import jakarta.validation.Validator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import spring.domain.donatedItems.DonatedItems

class DonatedItemValidationTest {
    private lateinit var validator: Validator

    @BeforeEach
    fun setUp() {
        val factory = Validation.buildDefaultValidatorFactory()
        validator = factory.validator;
    }

    @Test
    fun testDonatedItems_withNullType_shouldFailValidation() {
        val item = DonatedItems()
        val constraintViolations = validator.validate(item)
        println(constraintViolations)
        assertThat(constraintViolations.size).isGreaterThan(0)
    }
}