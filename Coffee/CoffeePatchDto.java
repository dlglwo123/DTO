package com.dlglwo123.ControllerAndDto.DTO.Coffee;

public class CoffeePatchDto {

    private long coffeeId;
    @NotSpace
    private String korName;
    @NotSpace
    @MyEng
    private String engName;
    @MyRange
    private long price;

    public long getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getKorName() {
        return korName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

}
