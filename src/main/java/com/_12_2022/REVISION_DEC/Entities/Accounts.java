package com._12_2022.REVISION_DEC.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class Accounts {
	
	private int accountId;
	private String accountType;
	private String accountName;
	private String IBAN;
	private Date OpeningDate;
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(int accountId, String accountType, String accountName, String iBAN, Date openingDate) {
		super();
		this.accountId = accountId;
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
		return "Accounts [accountId=" + accountId + ", accountType=" + accountType + ", accountName=" + accountName
				+ ", IBAN=" + IBAN + ", OpeningDate=" + OpeningDate + "]";
	}
	
}
