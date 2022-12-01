package com.dm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dm.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}
