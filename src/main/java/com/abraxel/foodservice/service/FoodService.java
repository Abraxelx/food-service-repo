package com.abraxel.foodservice.service;

import com.abraxel.foodservice.entity.Food;
import com.abraxel.foodservice.entity.Ingredients;
import com.abraxel.foodservice.entity.Measurement;
import com.abraxel.foodservice.repository.FoodRepository;
import com.abraxel.foodservice.repository.IngredientsRepository;
import com.abraxel.foodservice.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    FoodRepository repository;

    @Autowired
    IngredientsRepository ingredientsRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    public List<Food> getAllFoods(){
        return  repository.findAll();
    }

    public Food saveNewFood(Food food){
        return repository.save(food);
    }
    public Ingredients saveNewIngredient(Ingredients ingredients){
        return ingredientsRepository.save(ingredients);
    }
    public Measurement saveMeasurement(Measurement measurement){
        return measurementRepository.save(measurement);
    }
}
