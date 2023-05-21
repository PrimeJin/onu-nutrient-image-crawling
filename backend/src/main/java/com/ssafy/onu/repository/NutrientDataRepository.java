package com.ssafy.onu.repository;

import com.ssafy.onu.entity.NutrientData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface NutrientDataRepository extends JpaRepository<NutrientData, Long> {


}
