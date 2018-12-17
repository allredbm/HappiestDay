package com.techtalentsouth.HappiestDay.Registry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registry {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;
	private String itemName;
	private String itemURL;
	private String imageURL;
    private int quantityRequested;
    private int quantityPurchased;
    private int desireScale;
    
    public Registry() {
    	
    }
    
    public Registry(String itemName, String itemURL, String imageURL, int quantityRequested, int desireScale) {
    	this.itemName = itemName;
    	this.itemURL = itemURL;
    	this.imageURL = imageURL;
    	this.quantityRequested = quantityRequested;
    	this.desireScale = desireScale;
    }

	public Long getId() {
		return id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemURL() {
		return itemURL;
	}

	public void setItemURL(String itemURL) {
		this.itemURL = itemURL;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public int getQuantityRequested() {
		return quantityRequested;
	}

	public void setQuantityRequested(int quantityRequested) {
		this.quantityRequested = quantityRequested;
	}

	public int getQuantityPurchased() {
		return quantityPurchased;
	}

	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}
	
	public int getDesireScale() {
		return desireScale;
	}

	public void setDesireScale(int desireScale) {
		this.desireScale = desireScale;
	}

}
