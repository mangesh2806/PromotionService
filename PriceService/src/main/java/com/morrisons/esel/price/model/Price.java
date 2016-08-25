package com.morrisons.esel.price.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="Price")
public class Price {

	private int priceId;
	private String storeId;
	private String productId;
	private String productRegularPrice;
	private String sellingUnitOfMeasure;
	private String simplePromotionPrice;
	private String actualPrice;
	private String isOnSimplePromotion;
		
	@DynamoDBHashKey(attributeName="price_id")
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
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
	public String getProductRegularPrice() {
		return productRegularPrice;
	}
	public void setProductRegularPrice(String productRegularPrice) {
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
	public String getSimplePromotionPrice() {
		return simplePromotionPrice;
	}
	public void setSimplePromotionPrice(String simplePromotionPrice) {
		this.simplePromotionPrice = simplePromotionPrice;
	}
	
	@DynamoDBAttribute(attributeName="actualPrice")
	public String getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(String actualPrice) {
		this.actualPrice = actualPrice;
	}
	
	@DynamoDBAttribute(attributeName="isOnSimplePromotion")
	public String getIsOnSimplePromotion() {
		return isOnSimplePromotion;
	}
	public void setIsOnSimplePromotion(String isOnSimplePromotion) {
		this.isOnSimplePromotion = isOnSimplePromotion;
	}
	
	/*private String price;
	private String sellingUEP;
	private String promotionPrice;
	private String wasPrice;
	private String wasWasPrice;
	private String higherPriceChargedDates;
	
	@DynamoDBHashKey(attributeName="price")
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@DynamoDBAttribute(attributeName="sellingUEP")
	public String getSellingUEP() {
		return sellingUEP;
	}
	public void setSellingUEP(String sellingUEP) {
		this.sellingUEP = sellingUEP;
	}
	@DynamoDBAttribute(attributeName="promotionPrice")
	public String getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	@DynamoDBAttribute(attributeName="wasPrice")
	public String getWasPrice() {
		return wasPrice;
	}
	public void setWasPrice(String wasPrice) {
		this.wasPrice = wasPrice;
	}
	@DynamoDBAttribute(attributeName="wasWasPrice")
	public String getWasWasPrice() {
		return wasWasPrice;
	}
	public void setWasWasPrice(String wasWasPrice) {
		this.wasWasPrice = wasWasPrice;
	}
	@DynamoDBAttribute(attributeName="higherPriceChargedDates")
	public String getHigherPriceChargedDates() {
		return higherPriceChargedDates;
	}
	public void setHigherPriceChargedDates(String higherPriceChargedDates) {
		this.higherPriceChargedDates = higherPriceChargedDates;
	}*/
	
	

	
}
