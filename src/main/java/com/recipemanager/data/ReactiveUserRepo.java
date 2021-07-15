package com.recipemanager.data;

import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import reactor.core.publisher.Mono;

import org.springframework.stereotype.Repository;

import com.recipemanager.beans.User;

@Repository
public interface ReactiveUserRepo extends ReactiveCassandraRepository<User, String> {
	@AllowFiltering
	Mono<User> findByLastnameAndFirstname(String lastname, String firstname);
	@AllowFiltering
	Mono<User> findByUserID(UUID userID);
	Mono<Void> deleteByUserID(UUID id);
}