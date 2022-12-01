package com.dm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medicine")
public class Medicine {

	private long id;
	private String medicineName;
	private String medicineCategory;
	private int quantity;

	public Medicine() {
	}

	public Medicine(String medicineName, String medicineCategory, int quantity) {
		super();
		this.medicineName = medicineName;
		this.medicineCategory = medicineCategory;
		this.quantity = quantity;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the medicineName
	 */
	@Column(name= "medicineName", unique = true)
	public String getMedicineName() {
		return medicineName;
	}

	/**
	 * @param medicineName the medicineName to set
	 */
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	/**
	 * @return the medicineCategory
	 */
	@Column(name= "medicineCategory", unique = true)
	public String getMedicineCategory() {
		return medicineCategory;
	}

	/**
	 * @param medicineCategory the medicineCategory to set
	 */
	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	/**
	 * @return the quantity
	 */
	@Column(name= "medicineQuantity")
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
    
}
