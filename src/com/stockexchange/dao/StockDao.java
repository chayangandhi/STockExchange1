package com.stockexchange.dao;

import java.util.List;

import com.stockexchange.model.Stock;

public interface StockDao 
{
	public void saveStock(Stock stock);
	public List<Stock> showStockList();
}
