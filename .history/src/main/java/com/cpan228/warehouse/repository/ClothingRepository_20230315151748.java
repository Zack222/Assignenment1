package com.cpan228.warehouse.repository;

import com.cpan228.warehouse.model.Clothing;
import com.cpan228.warehouse.model.Clothing.Branding;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClothingRepository extends JpaRepository<Clothing, Long> {
  
  @Query("SELECT c FROM Clothing c WHERE c.brand = :brand AND c.yearProduced = :year")
  List<Clothing> findByBrandAndYear(@Param("brand") Branding brand, @Param("year") int year);

}