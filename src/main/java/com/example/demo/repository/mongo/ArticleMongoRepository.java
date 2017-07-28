package com.example.demo.repository.mongo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.mongo.ArticleMongo;

@Repository
public interface ArticleMongoRepository extends MongoRepository<ArticleMongo, String> {
	
	public Page<ArticleMongo> findAll(Pageable pageRequest );	
	
	@Query("{inPostgre : {$exists : false}}")
    public Page<ArticleMongo> findNotInsertedInMongo(Pageable pageRequest);
	
	@Query("{'humanFiltered.searchInPostgre' : {$exists : false}}")
    public Page<ArticleMongo> findSearchNotInsertedInMongo(Pageable pageRequest);
	
	@Query("{'humanFiltered.humanFilteredInPostgre' : {$exists : false}}")
    public Page<ArticleMongo> findHumanFilteredNotInsertedInMongo(Pageable pageRequest);

}
