package com.dev.marketplace.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UserAgeValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAgeConstraint {
    String message() default "Idade inválida";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};
}