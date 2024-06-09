package com.NationalStockExchange.NSE.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NationalStockExchange.NSE.Model.Company;

@Repository
public interface DaoRepository extends JpaRepository<Company, Integer>{

}
