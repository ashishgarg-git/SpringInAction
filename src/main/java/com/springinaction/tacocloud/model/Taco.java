package com.springinaction.tacocloud.model;

import com.springinaction.tacocloud.Ingredient;
import lombok.Data;

import java.util.List;

@Data
public class Taco {

    private String name;
    private List<Ingredient> ingredients;

}
