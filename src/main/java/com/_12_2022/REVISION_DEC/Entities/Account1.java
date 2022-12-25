package com._12_2022.REVISION_DEC.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

@Entity
public class Account1 {
	
	@Id
	private int accountId;
	private int custId;
	@NotNull
	private String accountType;
	private String accountName;
//	@NotNull 
	private String IBAN;
	@FutureOrPresent(message = " Date has to be present or in future")
	private Date OpeningDate;
	public Account1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account1(int accountId, int custId, @NotNull String accountType, String accountName, String iBAN,
			@FutureOrPresent(message = " Date has to be present or in future") Date openingDate) {
		super();
		this.accountId = accountId;
		this.custId = custId;
		this.accountType = accountType;
		this.accountName = accountName;
		IBAN = iBAN;
		OpeningDate = openingDate;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public Date getOpeningDate() {
		return OpeningDate;
	}
	public void setOpeningDate(Date openingDate) {
		OpeningDate = openingDate;
	}
	@Override
	public String toString() {
		return "Account1 [accountId=" + accountId + ", custId=" + custId + ", accountType=" + accountType
				+ ", accountName=" + accountName + ", IBAN=" + IBAN + ", OpeningDate=" + OpeningDate + "]";
	}
	
}
