package com.morrisons.esel.promotion.dao;

import java.util.List;

import com.morrisons.esel.promotion.model.Promotion;

public interface PromotionDao {
	public List<Promotion> fetchAll();
	public List<Promotion> fetchByStoreAndProductId(String storeId, String productId);
}
