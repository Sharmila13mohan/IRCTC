package com.irctc.SearchEngine.dto;

public class FoodMenuDTO {

	String trainId;
	String meal1;
	String meal2;
	String meal3;
	float foodPrice;

	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public String getMeal1() {
		return meal1;
	}

	public void setMeal1(String meal1) {
		this.meal1 = meal1;
	}

	public String getMeal2() {
		return meal2;
	}

	public void setMeal2(String meal2) {
		this.meal2 = meal2;
	}

	public String getMeal3() {
		return meal3;
	}

	public void setMeal3(String meal3) {
		this.meal3 = meal3;
	}

	public float getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(float foodPrice) {
		this.foodPrice = foodPrice;
	}

}
