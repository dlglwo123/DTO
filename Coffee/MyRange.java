package com.dlglwo123.ControllerAndDto.DTO.Coffee;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {MyRangeValidator.class})
public @interface MyRange {
    String message() default "숫자 범위내에 입력하십시오(100~50000)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
