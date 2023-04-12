package com.dlglwo123.ControllerAndDto.DTO.Coffee;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {MyEngValidator.class})
public @interface MyEng {
    String message() default "영문자를 입력해주십시오.(워드 사이에 한칸의 공백(스페이스)만 포함 될 수 있습니다)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
