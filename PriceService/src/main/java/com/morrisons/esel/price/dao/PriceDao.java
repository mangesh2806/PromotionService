package com.morrisons.esel.price.dao;

import java.util.List;

import com.morrisons.esel.price.model.Price;

public interface PriceDao {
	public List<Price> fetchAll();

	public List<Price> fetchByStoreAndProductId(String storeId, String productId);
}
