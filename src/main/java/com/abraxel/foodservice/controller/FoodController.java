package com.abraxel.foodservice.controller;

import com.abraxel.foodservice.entity.Food;
import com.abraxel.foodservice.entity.Ingredients;
import com.abraxel.foodservice.entity.Measurement;
import com.abraxel.foodservice.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class FoodController {

    @Autowired
    FoodService service;

    @GetMapping("/hello")
    public Food hello(){

        List<Ingredients> ingredientList = new ArrayList<>();
        Ingredients ingredients = new Ingredients();
        ingredients.setIngredients("ŞEKER");
        ingredientList.add(ingredients);

        Food food = new Food();
        food.setFoodName("ESRANUR");
        food.addIngredients(ingredients);
        food.setRecipe("HEPSİNİ KARIŞTIR");
        food.setImageURL("https://image.similarpng.com/very-thumbnail/2020/04/85489-2.png");
        return food;
    }

    @GetMapping("/save")
    public String saveFood(){
        Ingredients ingredients1 = new Ingredients();
        ingredients1.setIngredients("ŞEKER");
        Measurement measurement = new Measurement();
        measurement.setName("1 Bardak");
        ingredients1.setMeasurement(measurement);

        Ingredients ingredients2 = new Ingredients();
        ingredients2.setIngredients("BAL");
        Measurement measurement2 = new Measurement();
        measurement2.setName("1 KAŞIK");
        ingredients2.setMeasurement(measurement2);

        //FOOD
        Food food = new Food();
        food.setFoodName("ESRANUR");
        food.setRecipe("HEPSİNİ KARIŞTIR");
        food.setImageURL("https://image.similarpng.com/very-thumbnail/2020/04/85489-2.png");
        food.addIngredients(ingredients1);
        food.addIngredients(ingredients2);

        service.saveNewFood(food);

        return "Food Saved Succesfully";

    }

}
