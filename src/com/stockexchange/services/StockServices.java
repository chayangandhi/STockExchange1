package com.stockexchange.services;

import java.util.List;

import com.stockexchange.model.Stock;

public interface StockServices 
{
	public void saveStock(Stock stock);
	public List<Stock> showStockList();
}
