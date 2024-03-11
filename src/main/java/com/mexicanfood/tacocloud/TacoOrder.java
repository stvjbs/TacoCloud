package com.mexicanfood.tacocloud;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.List;
@Data
public class TacoOrder {

    @NotBlank(message = "Field mustn't be empty.")
    private String deliveryName;
    @NotBlank(message = "Field mustn't be empty.")
    private String deliveryStreet;
    @NotBlank(message = "Field mustn't be empty.")
    private String deliveryCity;
    @NotBlank(message = "Field mustn't be empty.")
    private String deliveryState;
    @NotBlank(message = "Field mustn't be empty.")
    private String deliveryZip;
    @CreditCardNumber(message = "Not a valid credit card number.")
    private String ccNumber;
    @NotBlank(message = "Field mustn't be empty.")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Not a valid CVV code.")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();
    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}