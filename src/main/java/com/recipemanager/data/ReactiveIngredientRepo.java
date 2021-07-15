package com.recipemanager.data;

import java.util.UUID;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import com.recipemanager.beans.Ingredient;

import reactor.core.publisher.Mono;

@Repository
public interface ReactiveIngredientRepo extends ReactiveCassandraRepository<Ingredient, String> {
	@AllowFiltering
	Mono<Ingredient> findByIngredientId(UUID id);
}
