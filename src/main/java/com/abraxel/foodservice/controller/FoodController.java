package com.abraxel.foodservice.controller;

import com.abraxel.foodservice.entity.Food;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodController {

    @GetMapping("/hello")
    public Food hello(){
        List<String> ingredients = new ArrayList<>();
        ingredients.add("ŞEKER");
        ingredients.add("BAL");
        ingredients.add("GÜZEL OLAN HER ŞEY");

        Food food = new Food();
        food.setFoodName("ESRANUR");
        food.setIngredients(ingredients);
        food.setRecipe("HEPSİNİ KARIŞTIR");
        food.setImageURL("https://image.similarpng.com/very-thumbnail/2020/04/85489-2.png");
        return food;
    }

}
