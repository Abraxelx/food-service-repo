package com.abraxel.foodservice.entity;

import lombok.Data;

import java.util.List;

@Data
public class Food {
    private String foodName;
    private List<String> ingredients;
    private String recipe;
    private String imageURL;
}
