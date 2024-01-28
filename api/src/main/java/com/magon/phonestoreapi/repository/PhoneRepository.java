package com.magon.phonestoreapi.repository;

import com.magon.phonestoreapi.model.Phone;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhoneRepository extends MongoRepository<Phone, String> {

}
