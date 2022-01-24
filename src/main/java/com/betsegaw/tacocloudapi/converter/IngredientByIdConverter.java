package com.betsegaw.tacocloudapi.converter;

import java.util.HashMap;
import java.util.Map;

import com.betsegaw.tacocloudapi.model.Ingredient;
import com.betsegaw.tacocloudapi.model.Ingredient.Type;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
        private Map<String, Ingredient> ingrMap = new HashMap<>();

        public IngredientByIdConverter() {
                ingrMap.put("FLTO", new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
                ingrMap.put("COTO", new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
                ingrMap.put("GRBF", new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
                ingrMap.put("CARN", new Ingredient("CARN", "Carnitas", Type.PROTEIN));
                ingrMap.put("TMTO", new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
                ingrMap.put("LETC", new Ingredient("LETC", "Lettuce", Type.VEGGIES));
                ingrMap.put("CHED", new Ingredient("CHED", "Cheddar", Type.CHEESE));
                ingrMap.put("JACK", new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
                ingrMap.put("SLSA", new Ingredient("SLSA", "Salsa", Type.SAUCE));
                ingrMap.put("SRCR", new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
        }

        @Override
        public Ingredient convert(String id) {
                return ingrMap.get(id);
        }

}
