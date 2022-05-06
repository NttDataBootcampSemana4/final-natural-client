package com.bootcampfinal.naturalclient.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcampfinal.naturalclient.app.entities.TypeNaturalClient;

@Repository
public interface TypeNaturalClientRepository extends ReactiveMongoRepository<TypeNaturalClient, String> {

}
