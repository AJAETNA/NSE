package com.NationalStockExchange.NSE.Controller;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NationalStockExchange.NSE.Model.Company;
import com.NationalStockExchange.NSE.Services.CompanyService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HomeController {
	@Autowired
	CompanyService ser;
	
	@PostMapping("/addcompany")
	public Company saveCompany(@RequestBody Company com) 
	{
		return this.ser.addCompany(com);

	}
	
	@GetMapping("/company")
	public List<Company> show()
	{
		return this.ser.getAllCompany();

	}
	
	@GetMapping("/company/{cId}")
	public Optional<Company> showCompany(@PathVariable("cid") String c) {
		return this.ser.getSpecificCompany(Integer.parseInt(c));
	}
	
	@PutMapping("/updateCompany")
	public Company updateCompany(@RequestBody Company com) 
	{
		return this.ser.updateCompany(com);
	}
	
	@DeleteMapping("/deletecompany/{cId}")
	public void deleteCompany(@PathVariable("cId")String c) {
		this.ser.deleteCompany(Integer.parseInt(c));
	}
	
//	
}
