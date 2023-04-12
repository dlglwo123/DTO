package com.dlglwo123.ControllerAndDto.DTO.Coffee;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class MyRangeValidator implements ConstraintValidator<MyRange,Long> {
    @Override
    public void initialize(MyRange constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if(value == null || StringUtils.hasText(String.valueOf(value))){
            if (value >= 100 && value <= 50000) {
                return true;
            }
        }
        return false;
    }
}
