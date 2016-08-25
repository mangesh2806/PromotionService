package com.morrisons.esel.promotion.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.morrisons.esel.promotion.model.Promotion;
import com.morrisons.esel.promotion.util.DynamoDBUtil;

public class PromotionDaoImpl implements PromotionDao {
	private DynamoDBMapper mapper = DynamoDBUtil.getMapper();

	public List<Promotion> fetchAll() {
		
		List<Promotion> promotionList = new ArrayList<Promotion>();
		promotionList = mapper.scan(Promotion.class, new DynamoDBScanExpression());
		return promotionList;
	}
	
	public List<Promotion> fetchByStoreAndProductId(String storeId, String productId) {
		List<Promotion> promotionList = new ArrayList<Promotion>();
		
		Map<String, AttributeValue> eav = new HashMap<String, AttributeValue>();
		eav.put(":val1", new AttributeValue().withS(storeId));
		eav.put(":val2", new AttributeValue().withS(productId));

		DynamoDBScanExpression scanExpression = new DynamoDBScanExpression()
				.withFilterExpression("store_id = :val1 and product_id = :val2").withExpressionAttributeValues(eav);

		promotionList = mapper.scan(Promotion.class, scanExpression);		
		
		return promotionList;
	}

}
