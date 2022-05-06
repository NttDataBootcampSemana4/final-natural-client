package com.bootcampfinal.naturalclient.app.services;

import com.bootcampfinal.naturalclient.app.entities.NaturalClient;
import com.bootcampfinal.naturalclient.app.entities.TypeNaturalClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NaturalClientService {

	public Mono<NaturalClient> findById(String id);

	public Flux<NaturalClient> findAlls();

	public Mono<NaturalClient> saves(NaturalClient document);

	public Mono<Void> delete(NaturalClient document);

	public Flux<TypeNaturalClient> findAllTypeNaturalClient();

	public Mono<TypeNaturalClient> findTypeNaturalClientById(String id);

	public Mono<TypeNaturalClient> saveTypeNaturalClient(TypeNaturalClient document);

}
