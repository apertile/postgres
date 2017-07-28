package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HumanFiltered;

@Repository
public interface HumanFilteredRepository extends PagingAndSortingRepository<HumanFiltered, Long>{

}
