package com.recipemanager.data;

import java.util.UUID;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import com.recipemanager.beans.Requests;

import reactor.core.publisher.Mono;

@Repository
public interface ReactiveRequestRepo extends ReactiveCassandraRepository<Requests, String> {

	Mono<Requests> findByRequestId(UUID requestId);

}
