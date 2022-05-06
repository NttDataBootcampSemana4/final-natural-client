package com.bootcampfinal.naturalclient.app.services;

import com.bootcampfinal.naturalclient.app.entities.NaturalClient;
import com.bootcampfinal.naturalclient.app.entities.TypeNaturalClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TypeNaturalClientService {

	public Mono<TypeNaturalClient> findById(String id);

	public Flux<TypeNaturalClient> findAlls();

	public Mono<TypeNaturalClient> saves(TypeNaturalClient document);

	public Mono<Void> delete(TypeNaturalClient document);

	public Flux<NaturalClient> findbyName(String typenaturalId);
}
