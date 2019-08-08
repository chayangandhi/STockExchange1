package com.stockexchange.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stockexchange.dao.StockDao;
import com.stockexchange.model.Stock;

@Service
public class StockServicesImpl implements StockServices 
{
	@Autowired
	
	private StockDao stockDao;
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	@Override
	public void saveStock(Stock stock) {
		stockDao.saveStock(stock);
		
	}

	@Override
	public List<Stock> showStockList() {
		return stockDao.showStockList();
	}

}
