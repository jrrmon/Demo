package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.AbcTesting;

public interface AbcTestingRepository extends JpaRepository<AbcTesting, String> {

	@Query(value = "Select * from \"ABC_TESTING\"", nativeQuery = true)
	public List<AbcTesting> getAbcTesting();
}
