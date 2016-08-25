package com.morrisons.esel.promotion.model;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * @author mangesh13413
 *
 */
@DynamoDBTable(tableName="Promotion")
public class Promotion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String storeId;
	private String productId;
	private String promotionId;
	private Double promoPrice;
	private Integer promoType;
	private String startDate;
	private String endDate;
	private String itemGroup;
	private String threshold;
	private String offerValue;
	private Double wasPrice;
	private Double wasWasPrice;
	private String offerDurationMessage;
	private String offerName;
	
	@DynamoDBAttribute(attributeName="storeId")
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	@DynamoDBAttribute(attributeName="productId")
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	@DynamoDBHashKey(attributeName="promotionId")
	public String getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	@DynamoDBAttribute(attributeName="promoPrice")
	public Double getPromoPrice() {
		return promoPrice;
	}
	public void setPromoPrice(Double promoPrice) {
		this.promoPrice = promoPrice;
	}
	@DynamoDBAttribute(attributeName="promoType")
	public Integer getPromoType() {
		return promoType;
	}
	public void setPromoType(Integer promoType) {
		this.promoType = promoType;
	}
	@DynamoDBAttribute(attributeName="startDate")
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@DynamoDBAttribute(attributeName="endDate")
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@DynamoDBAttribute(attributeName="itemGroup")
	public String getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(String itemGroup) {
		this.itemGroup = itemGroup;
	}
	@DynamoDBAttribute(attributeName="threshold")
	public String getThreshold() {
		return threshold;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
	@DynamoDBAttribute(attributeName="offerValue")
	public String getOfferValue() {
		return offerValue;
	}
	public void setOfferValue(String offerValue) {
		this.offerValue = offerValue;
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
	@DynamoDBAttribute(attributeName="offerDurationMessage")
	public String getOfferDurationMessage() {
		return offerDurationMessage;
	}
	public void setOfferDurationMessage(String offerDurationMessage) {
		this.offerDurationMessage = offerDurationMessage;
	}
	@DynamoDBAttribute(attributeName="offerName")
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	
}
