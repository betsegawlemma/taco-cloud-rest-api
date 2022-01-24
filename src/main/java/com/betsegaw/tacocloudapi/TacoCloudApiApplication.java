package com.betsegaw.tacocloudapi;

import java.util.Arrays;

import com.betsegaw.tacocloudapi.model.Ingredient;
import com.betsegaw.tacocloudapi.model.Ingredient.Type;

import com.betsegaw.tacocloudapi.model.Taco;
import com.betsegaw.tacocloudapi.repository.IngredientRepository;
import com.betsegaw.tacocloudapi.repository.TacoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TacoCloudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(IngredientRepository ingrRepo, TacoRepository tacoRepo) {
		return args -> {
			Ingredient flourTortilla = new Ingredient(
					"FLTO", "Flour Tortilla", Type.WRAP);
			Ingredient cornTortilla = new Ingredient(
					"COTO", "Corn Tortilla", Type.WRAP);
			Ingredient groundBeef = new Ingredient(
					"GRBF", "Ground Beef", Type.PROTEIN);
			Ingredient carnitas = new Ingredient(
					"CARN", "Carnitas", Type.PROTEIN);
			Ingredient tomatoes = new Ingredient(
					"TMTO", "Diced Tomatoes", Type.VEGGIES);
			Ingredient lettuce = new Ingredient(
					"LETC", "Lettuce", Type.VEGGIES);
			Ingredient cheddar = new Ingredient(
					"CHED", "Cheddar", Type.CHEESE);
			Ingredient jack = new Ingredient(
					"JACK", "Monterrey Jack", Type.CHEESE);
			Ingredient salsa = new Ingredient(
					"SLSA", "Salsa", Type.SAUCE);
			Ingredient sourCream = new Ingredient(
					"SRCR", "Sour Cream", Type.SAUCE);
			ingrRepo.save(flourTortilla);
			ingrRepo.save(cornTortilla);
			ingrRepo.save(groundBeef);
			ingrRepo.save(carnitas);
			ingrRepo.save(tomatoes);
			ingrRepo.save(lettuce);
			ingrRepo.save(cheddar);
			ingrRepo.save(jack);
			ingrRepo.save(salsa);
			ingrRepo.save(sourCream);

			Taco taco1 = new Taco();
			taco1.setName("Carnivore");
			taco1.setIngredients(Arrays.asList(
					flourTortilla, groundBeef, carnitas,
					sourCream, salsa, cheddar));
			tacoRepo.save(taco1);

			Taco taco2 = new Taco();
			taco2.setName("Bovine Bounty");
			taco2.setIngredients(Arrays.asList(
					cornTortilla, groundBeef, cheddar,
					jack, sourCream));
			tacoRepo.save(taco2);

			Taco taco3 = new Taco();
			taco3.setName("Veg-Out");
			taco3.setIngredients(Arrays.asList(
					flourTortilla, cornTortilla, tomatoes,
					lettuce, salsa));
			tacoRepo.save(taco3);
		};
	}
}
