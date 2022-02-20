package com.abraxel.foodservice.repository;

import com.abraxel.foodservice.entity.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredients, Long> {
    List<Ingredients> findAll();
}
