package com.bootcampfinal.naturalclient.app.services;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcampfinal.naturalclient.app.entities.NaturalClient;
import com.bootcampfinal.naturalclient.app.entities.TypeNaturalClient;
import com.bootcampfinal.naturalclient.app.repository.NaturalClientRepository;
import com.bootcampfinal.naturalclient.app.repository.TypeNaturalClientRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TypeNaturalClientServiceImpl implements TypeNaturalClientService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TypeNaturalClientServiceImpl.class);
	@Autowired
	TypeNaturalClientRepository repository;

	@Autowired
	NaturalClientRepository naturalRepository;

	@Override
	public Mono<TypeNaturalClient> findById(String id) {

		return repository.findById(id);
	}

	@Override
	public Flux<TypeNaturalClient> findAlls() {

		return repository.findAll();
	}

	@Override
	public Mono<TypeNaturalClient> saves(TypeNaturalClient document) {

		return repository.save(document);
	}

	@Override
	public Mono<Void> delete(TypeNaturalClient document) {

		return repository.delete(document);
	}

	@Override
	public Flux<NaturalClient> findbyName(String typenaturalId) {

		NaturalClient typex = new NaturalClient();

		Mono<NaturalClient> type = naturalRepository.findById(typenaturalId);

		type.doOnNext(t -> {
			typex.setId(typenaturalId);
			typex.setCreateAt(new Date());

		}).subscribe(x -> LOGGER.info("encontrar por nombre" + x));

		return null;
	}
	
	
	

}
