package com.app.core;

import java.time.LocalDate;

public class Tape extends Publication {
 int playingTime;

public Tape(int id, String text, double price, LocalDate publishDate, int rating, int playingTime) {
	super(id, text, price, publishDate, rating);
	this.playingTime = playingTime;
}

public int getPlayingTime() {
	return playingTime;
}

public void setPlayingTime(int playingTime) {
	this.playingTime = playingTime;
}

@Override
public String toString() {
	return "Tape [playingTime=" + playingTime + "]";
}
 
}
