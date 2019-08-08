package com.stockexchange.dao;

import java.util.List;

import com.stockexchange.model.Company;

public interface CompanyDao 
{
	public void saveCompany(Company company);
	public List<Company> showCompanyList();
}
