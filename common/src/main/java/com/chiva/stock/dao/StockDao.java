package com.chiva.stock.dao;

import com.chiva.stock.model.Stock;

public interface StockDao {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);

}
