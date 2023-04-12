package com.dlglwo123.ControllerAndDto.DTO.Coffee;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/v1/coffees")
@Validated
public class CoffeeController {

    @PostMapping
    public ResponseEntity CreateCoffee(@Valid @RequestBody CoffeePostDto coffeePostDto) {
        return new ResponseEntity<>(coffeePostDto, HttpStatus.CREATED);
        //ResponseEntity : httpEntity 를 상속받는, 결과 데이터와 HTTP 상태 코드를 직접 제어할 수 있는 클래스
    }

    @PatchMapping("/{ID}")
    public ResponseEntity UpdateCoffee(@PathVariable("ID")  long coffeeId,
                                      @Valid @RequestBody CoffeePatchDto coffeePatchDto){
        // 업데이트할 값을 적용해줘야 함
        coffeePatchDto.setCoffeeId(coffeeId);
        return new ResponseEntity<>(coffeePatchDto,HttpStatus.OK);
    }
}
