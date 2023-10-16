package com.dev.marketplace.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;

public class UserAgeValidator implements ConstraintValidator<UserAgeConstraint, LocalDate> {

    @Override
    public void initialize(UserAgeConstraint userAgeConstraint) {
    }

    @Override
    public boolean isValid(LocalDate ageField, ConstraintValidatorContext validationContext) {
        return ageField != null && Period.between(ageField, LocalDate.now()).getYears() >= 18;
    }

}