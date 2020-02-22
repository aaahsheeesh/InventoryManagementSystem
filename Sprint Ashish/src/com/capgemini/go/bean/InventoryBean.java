package com.capgemini.go.bean;

import java.time.*;  
import java.time.temporal.Temporal;
import java.util.Date;  

@SuppressWarnings("unused")
public class InventoryBean {
	
	String retailerId;
	String retailerName;
	byte productCategoryNumber;
	String productCategoryName;
	String productName;
	String productUniqueId;
	Period deliveryTimePeriod;
	Period shelfTimePeriod;
	LocalDateTime recievedate ;
	LocalDateTime saledate;
	
	InventoryBean(String retailerName, String retailerId){
	      this.retailerName = retailerName;
	      this. retailerId =  retailerId;
	   }
	
	
	public InventoryBean(String retailerId, String retailerName, String productName, String productUniqueId, LocalDateTime receiveDateTime, LocalDateTime saleDateTime) {
		
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.productName = productName;
		this.productUniqueId = productUniqueId;
		this.recievedate = receiveDateTime;
		this.saledate = saleDateTime;
	}


	@Override
	public String toString() {
		return  "Retailer_Id : " + retailerId  + "\t" + "Retailer_Name : " + retailerName + "\t"+ "Product_Name : " + productName +  "\t" +
	    "Product_Unique_Id : " + productUniqueId + "\t" + "Receive_Time :"  + recievedate +"\t" + "Sale_Time :" + saledate;
				
	}

	public String getRetailerId() {
		return retailerId;
	}


	public LocalDateTime getRecievedate() {
		return recievedate;
	}


	public void setRecievedate(LocalDateTime recievedate) {
		this.recievedate = recievedate;
	}


	public LocalDateTime getSaledate() {
		return saledate;
	}


	public void setSaledate(LocalDateTime saledate) {
		this.saledate = saledate;
	}


	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}


	public String getRetailerName() {
		return retailerName;
	}


	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}


	public byte getProductCategoryNumber() {
		return productCategoryNumber;
	}


	public void setProductCategoryNumber(byte productCategoryNumber) {
		this.productCategoryNumber = productCategoryNumber;
	}


	public String getProductCategoryName() {
		return productCategoryName;
	}


	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductUniqueId() {
		return productUniqueId;
	}


	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}


	public Period getDeliveryTimePeriod() {
		return deliveryTimePeriod;
	}


	public void setDeliveryTimePeriod(Period deliveryTimePeriod) {
		this.deliveryTimePeriod = deliveryTimePeriod;
	}


	public Period getShelfTimePeriod() {
		return shelfTimePeriod;
	}


	public void setShelfTimePeriod(Period shelfTimePeriod) {
		this.shelfTimePeriod = shelfTimePeriod;
	}


	
	
	public InventoryBean(){
	
	}
	
	
	public InventoryBean(String retailerId, String retailerName, byte productCategoryNumber,
			String productCategoryName, String productName, String productUniqueId, Period deliveryTimePeriod,
			Period shelfTimePeriod) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.productCategoryNumber = productCategoryNumber;
		this.productCategoryName = productCategoryName;
		this.productName = productName;
		this.productUniqueId = productUniqueId;
		this.deliveryTimePeriod = deliveryTimePeriod;
		this.shelfTimePeriod = shelfTimePeriod;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
