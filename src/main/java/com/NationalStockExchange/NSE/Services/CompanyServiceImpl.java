package com.NationalStockExchange.NSE.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.NationalStockExchange.NSE.DAO.*;
import com.NationalStockExchange.NSE.Model.Company;
@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	DaoRepository repo;
	
	@Override
	public Company addCompany(Company company) {
		return this.repo.save(company);
	}


	@Override
	public List<Company> getAllCompany() {
		return this.repo.findAll();
	}

	@Override
	public Optional<Company> getSpecificCompany(int comId) {
		return this.repo.findById(comId);
	}

	@Override
	public Company updateCompany(Company company) {
		return this.repo.save(company);
	}

	@Override
	public void deleteCompany(int cid) {
		Optional<Company> c = this.repo.findById(cid);
		Company com = c.get();
		this.repo.delete(com);
	}
}
