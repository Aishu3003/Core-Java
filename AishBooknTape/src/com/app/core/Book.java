package com.app.core;

import java.time.LocalDate;

public class Book extends Publication {
   int pageCount;

public Book(int id, String text, double price, LocalDate publishDate, int rating, int pageCount) {
	super(id, text, price, publishDate, rating);
	this.pageCount = pageCount;
}

public int getPageCount() {
	return pageCount;
}

public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}
@Override
public String toString() {
	
	return "page Count:" +pageCount;
}
   
   
   
}
