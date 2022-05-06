package com.bootcampfinal.naturalclient.app.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcampfinal.naturalclient.app.entities.NaturalClient;
import com.bootcampfinal.naturalclient.app.entities.TypeNaturalClient;
import com.bootcampfinal.naturalclient.app.repository.NaturalClientRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class NaturalClientServiceImpl implements NaturalClientService {
	private static final Logger LOGGER = LoggerFactory.getLogger(NaturalClientServiceImpl.class);
	@Autowired
	NaturalClientRepository repository;

	@Override
	public Mono<NaturalClient> findById(String id) {

		return repository.findById(id);
	}

	@Override
	public Flux<NaturalClient> findAlls() {

		return repository.findAll();
	}

	@Override
	public Mono<NaturalClient> saves(NaturalClient document) {

		return repository.save(document);
	}

	@Override
	public Mono<Void> delete(NaturalClient document) {

		return repository.delete(document);
	}

	@Override
	public Flux<TypeNaturalClient> findAllTypeNaturalClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<TypeNaturalClient> findTypeNaturalClientById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<TypeNaturalClient> saveTypeNaturalClient(TypeNaturalClient document) {
		// TODO Auto-generated method stub
		return null;
	}



}
