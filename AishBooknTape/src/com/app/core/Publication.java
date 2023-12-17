package com.app.core;

import java.time.LocalDate;

public class Publication {
	private int id;
	private String text;
	private double price;
	private LocalDate publishDate;
	int rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Publication(int id, String text, double price, LocalDate publishDate, int rating) {

		this.id = id;
		this.text = text;
		this.price = price;
		this.publishDate = publishDate;
		this.rating = rating;
	}

	
	
}
