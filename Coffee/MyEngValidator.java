package com.dlglwo123.ControllerAndDto.DTO.Coffee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyEngValidator implements ConstraintValidator<MyEng,String> {

    @Override
    public void initialize(MyEng constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String pattern = "^([A-Za-z])(\\s?[A-Za-z])*$";
        return value.matches(pattern);
    }
}
