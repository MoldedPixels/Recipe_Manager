package com.recipemanager.services;

import java.util.Map;
import java.util.UUID;

import com.recipemanager.beans.Kitchen;
import com.recipemanager.beans.Recipe;

import reactor.core.publisher.Mono;

public interface KitchenService {

	Mono<Kitchen> removeFood(String listname, Kitchen k, UUID ingredient, Double amount);

	Mono<Kitchen> cook(Recipe r, Kitchen k);

	Mono<Kitchen> getKitchenByID(UUID id);

	Mono<Kitchen> updateKitchen(Kitchen k);

	Mono<Kitchen> addKitchen(Kitchen k);

	Map<UUID, Double> getShoppingList(String kitchenId);

	Map<UUID, Double> getKitchenInv(String kitchen);

	Mono<Kitchen> addFood(String listname, Kitchen k, UUID iID, Double amt);
}
