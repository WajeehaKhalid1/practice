package model;

import java.util.Observable;

public class Book extends Observable{
	private String title;
	private double price;
	private double weight;
	private String author;
	
	public Book(String title, String author,double price, double weight) {
		this.author=author;
		this.price=price;
		this.title=title;
		this.weight= weight;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		super.setChanged();
		super.notifyObservers();
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}