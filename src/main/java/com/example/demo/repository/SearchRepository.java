package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Search;

@Repository
public interface SearchRepository extends PagingAndSortingRepository<Search, String> {

}
