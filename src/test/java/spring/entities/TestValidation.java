package spring.entities;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import spring.domain.model.donatedItems.DonatedItems;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

public class TestValidation {



    @Before("testValid")
    public static void setUpValidator() {

    }

    @Test
    public void testValid() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        DonatedItems items = new DonatedItems();
        Set<ConstraintViolation<DonatedItems>> constraintViolations =
                validator.validate( items );
        assertThat(constraintViolations.size()).isGreaterThan(0);
    }
    
}
