package com.dlglwo123.ControllerAndDto.DTO.Coffee;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CoffeePostDto {

    @NotBlank
    private String korName;

    @NotBlank
    @MyEng
    private String engName;

    @MyRange
    private long price;

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public long getPrice() {
        return price;
    }

}
