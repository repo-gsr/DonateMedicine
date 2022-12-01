package com.dm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dm.entity.Medicine;
import com.dm.service.MedicineService;

@RestController
@RequestMapping("api/medicine")
public class MedicineController {
	
	@Autowired
	private MedicineService medicineService;
	
	
	@PostMapping
	public ResponseEntity<Medicine> addMedicine(@RequestBody Medicine medicine) {
		return new ResponseEntity<Medicine>(medicineService.save(medicine), HttpStatus.CREATED);
	}
	
}
