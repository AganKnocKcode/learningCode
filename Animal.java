package com.itheima_day07_02;

public class Animal {
	private String breed;
	private String color;

	public Animal() {
	}

	public Animal(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat(){
		System.out.println("�Զ���....");
	}

}
