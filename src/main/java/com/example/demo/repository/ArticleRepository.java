package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Article;

@Repository
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long>{
    
    Article findByVtKey(String vtKey);
    
}