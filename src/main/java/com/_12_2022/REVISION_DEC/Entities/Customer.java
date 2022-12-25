package com._12_2022.REVISION_DEC.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
	
	@Id
	private int id;
	private String cusotmerName;
	private String address;
	@NotNull
	private String identificationType;
	@FutureOrPresent(message=" Date has to be present or future ")
	private Date openingDtae;
	//@Size(min=10 , max=10 , message=" phone number should be of length 10 ")
	private Long phoneNumber;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String cusotmerName, String address, @NotNull String identificationType,
			@FutureOrPresent(message = " Date has to be present or future ") Date openingDtae,
			@Size(min = 10, max = 10, message = " phone number should be of length 10 ") Long phoneNumber) {
		super();
		this.id = id;
		this.cusotmerName = cusotmerName;
		this.address = address;
		this.identificationType = identificationType;
		this.openingDtae = openingDtae;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCusotmerName() {
		return cusotmerName;
	}
	public void setCusotmerName(String cusotmerName) {
		this.cusotmerName = cusotmerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdentificationType() {
		return identificationType;
	}
	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}
	public Date getOpeningDtae() {
		return openingDtae;
	}
	public void setOpeningDtae(Date openingDtae) {
		this.openingDtae = openingDtae;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cusotmerName=" + cusotmerName + ", address=" + address
				+ ", identificationType=" + identificationType + ", openingDtae=" + openingDtae + ", phoneNumber="
				+ phoneNumber + "]";
	}

	
}
