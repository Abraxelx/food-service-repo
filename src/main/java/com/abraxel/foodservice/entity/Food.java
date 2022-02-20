package com.abraxel.foodservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "food")
public class Food implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String foodName;
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Ingredients> ingredients = new HashSet<>();
    private String recipe;
    private String imageURL;

    public void addIngredients(Ingredients ingredients){
        this.ingredients.add(ingredients);
    }
}

