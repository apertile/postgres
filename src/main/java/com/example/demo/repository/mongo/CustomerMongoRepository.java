package com.example.demo.repository.mongo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.mongo.CustomerMongo;

@Repository
public interface CustomerMongoRepository extends MongoRepository<CustomerMongo, String>{
    
    @Query("{inPostgre : {$exists : false}}")
    public Page<CustomerMongo> findNotInsertedInMongo(Pageable pageRequest);

}
