package javaproject;

import java.util.Scanner;

public class food{
	String foodname;
	int price;
	int totalbill=100;
	Scanner sc=new Scanner(System.in);

	public float getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(int totalbill) {
		this.totalbill = (int) totalbill;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	

		
public   String getFoodname() {
	return foodname;
}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}