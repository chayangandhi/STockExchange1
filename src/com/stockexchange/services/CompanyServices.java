package com.stockexchange.services;

import java.util.List;

import com.stockexchange.model.Company;

public interface CompanyServices 
{
	public void saveCompany(Company company);
	public List<Company> showCompanyList();
}
