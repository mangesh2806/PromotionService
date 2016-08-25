package com.morrisons.esel.price.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="Price")
public class Price {

	private Integer priceId;
	private String storeId;
	private String productId;
	private Double productRegularPrice;
	private String sellingUnitOfMeasure;
	private Double simplePromotionPrice;
	private Double actualPrice;
	private boolean isOnSimplePromotion;
	
	//added new attributes as per the new contracts received
	
	private String sellingUEP;
	private Double wasPrice;
	private Double wasWasPrice;
	//end
		
	@DynamoDBHashKey(attributeName="price_id")
	public Integer getPriceId() {
		return priceId;
	}
	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}
	@DynamoDBAttribute(attributeName="store_id")
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	
	@DynamoDBAttribute(attributeName="product_id")
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	@DynamoDBAttribute(attributeName="productRegularPrice")
	public Double getProductRegularPrice() {
		return productRegularPrice;
	}
	public void setProductRegularPrice(Double productRegularPrice) {
		this.productRegularPrice = productRegularPrice;
	}
	
	@DynamoDBAttribute(attributeName="sellingUnitOfMeasure")
	public String getSellingUnitOfMeasure() {
		return sellingUnitOfMeasure;
	}
	public void setSellingUnitOfMeasure(String sellingUnitOfMeasure) {
		this.sellingUnitOfMeasure = sellingUnitOfMeasure;
	}
	
	@DynamoDBAttribute(attributeName="simplePromotionPrice")
	public Double getSimplePromotionPrice() {
		return simplePromotionPrice;
	}
	public void setSimplePromotionPrice(Double simplePromotionPrice) {
		this.simplePromotionPrice = simplePromotionPrice;
	}
	
	@DynamoDBAttribute(attributeName="actualPrice")
	public Double getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(Double actualPrice) {
		this.actualPrice = actualPrice;
	}
	@DynamoDBAttribute(attributeName="isOnSimplePromotion")
	public boolean isOnSimplePromotion() {
		return isOnSimplePromotion;
	}
	public void setOnSimplePromotion(boolean isOnSimplePromotion) {
		this.isOnSimplePromotion = isOnSimplePromotion;
	}
	@DynamoDBAttribute(attributeName="sellingUEP")
	public String getSellingUEP() {
		return sellingUEP;
	}
	public void setSellingUEP(String sellingUEP) {
		this.sellingUEP = sellingUEP;
	}
	@DynamoDBAttribute(attributeName="wasPrice")
	public Double getWasPrice() {
		return wasPrice;
	}
	public void setWasPrice(Double wasPrice) {
		this.wasPrice = wasPrice;
	}
	@DynamoDBAttribute(attributeName="wasWasPrice")
	public Double getWasWasPrice() {
		return wasWasPrice;
	}
	public void setWasWasPrice(Double wasWasPrice) {
		this.wasWasPrice = wasWasPrice;
	}
	
	
			
}
