package com.NationalStockExchange.NSE.Services;

import java.util.List;
import java.util.Optional;

import com.NationalStockExchange.NSE.Model.Company;

public interface CompanyService {
	
	public Company addCompany(Company company);
	public List<Company> getAllCompany();
	public Optional<Company> getSpecificCompany(int comId);
	public Company updateCompany(Company company);
	public void deleteCompany(int cid);
	
}
