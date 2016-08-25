package com.morrisons.esel.price.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.morrisons.esel.price.model.Price;
import com.morrisons.esel.price.util.DynamoDBUtil;

public class PriceDaoImpl implements PriceDao {
	private DynamoDBMapper mapper = DynamoDBUtil.getMapper();

	public List<Price> fetchAll() {
		
		List<Price> PriceList = new ArrayList<Price>();
		PriceList = mapper.scan(Price.class, new DynamoDBScanExpression());
		return PriceList;
	}

	public List<Price> fetchByStoreAndProductId(String storeId, String productId) {
		List<Price> PriceList = new ArrayList<Price>();
		
		Map<String, AttributeValue> eav = new HashMap<String, AttributeValue>();
		eav.put(":val1", new AttributeValue().withS(storeId));
		eav.put(":val2", new AttributeValue().withS(productId));

		DynamoDBScanExpression scanExpression = new DynamoDBScanExpression()
				.withFilterExpression("store_id = :val1 and product_id = :val2").withExpressionAttributeValues(eav);

		PriceList = mapper.scan(Price.class, scanExpression);		
		
		return PriceList;
	}

}
