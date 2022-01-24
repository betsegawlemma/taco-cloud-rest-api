package com.betsegaw.tacocloudapi.repository;

import com.betsegaw.tacocloudapi.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
