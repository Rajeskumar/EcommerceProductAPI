/**
 * 
 */
package com.ecom.product.domain;

/**
 * @author Rajeshkumar
 *
 */
public class Product {
	
	private String id;
	private String prdName;
	private String desc;
	private int rating;
	private String category;
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the prdName
	 */
	public String getPrdName() {
		return prdName;
	}
	/**
	 * @param prdName the prdName to set
	 */
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
}
