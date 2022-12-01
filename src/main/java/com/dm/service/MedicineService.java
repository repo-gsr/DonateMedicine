package com.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm.entity.Medicine;
import com.dm.repository.MedicineRepository;

@Service
public class MedicineService {
	
	@Autowired
	private MedicineRepository medicineRepository;
	

	public Medicine save(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

}
