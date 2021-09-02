package com.BridgeLabs.FoodDeliverySystem;

public class FoodItem {
	enum Taste {SWEET, SOUR, SPICY, BITTER};
    enum Category {STARTER, JUICES, MainCourse,DESERT};
    enum Type {Veg, NonVeg};
    protected String name;
    protected Taste taste;
    protected Category category;
    protected Type type;
    protected int price;
    
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", taste=" + taste + ", category=" + category + ", type=" + type + ", price="
				+ price + "]";
	}
}
