package com.NationalStockExchange.NSE.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "company")
public class Company {
	
	@Column(name = "company_id")
	@Id
	private int cId;
	
	@Column(name = "c_name")
	private String cName;
	
	@Column(name = "c_sector")
	private String cSector;
	
	@Column(name = "c_shareprice")
	private double cSharePrice;
	
	@Column(name = "c_marketcap")
	private double marketCap;
	
	@Column(name = "c_dividendyield")
	private long dividendyield;
	
	@Column(name = "c_peratio")
	private long pEratio;
	
	
	public Company() {
		super();
	}
	
	public Company(int cId, String cName, String cSector, double cSharePrice, double marketCap, long dividendyield,
			long pEratio) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cSector = cSector;
		this.cSharePrice = cSharePrice;
		this.marketCap = marketCap;
		this.dividendyield = dividendyield;
		this.pEratio = pEratio;
	}
	

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcSector() {
		return cSector;
	}
	public void setcSector(String cSector) {
		this.cSector = cSector;
	}
	public double getcSharePrice() {
		return cSharePrice;
	}
	public void setcSharePrice(double cSharePrice) {
		this.cSharePrice = cSharePrice;
	}
	public double getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}
	public long getDividendyield() {
		return dividendyield;
	}
	public void setDividendyield(long dividendyield) {
		this.dividendyield = dividendyield;
	}
	public long getpEratio() {
		return pEratio;
	}
	public void setpEratio(long pEratio) {
		this.pEratio = pEratio;
	}
	
	
}
