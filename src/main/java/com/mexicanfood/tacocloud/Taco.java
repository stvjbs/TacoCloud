package com.mexicanfood.tacocloud;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class Taco {
    @NotBlank
    @Size(min = 5, message = "Name must be at least 5 characters long.")
    private String name;
    @NotNull
    @Size(min = 1, message = "You must add at least 1 ingredient.")
    private List<Ingredient> ingredients;

}
