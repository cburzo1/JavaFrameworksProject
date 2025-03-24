package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class isBetweenMaxMinValidator implements ConstraintValidator<isBetweenMaxMin, Part> {
    @Override
    public void initialize(isBetweenMaxMin constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

        System.out.println("ERROR READ::" + part);

        if (part.getInv() < part.getMinInv() || part.getInv() > part.getMaxInv()) {
            return false;
        }

        return true;
    }
}
