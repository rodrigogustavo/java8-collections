package com.rd.java8_collections;

public class Game {

	private String name;
	private int minimalAge;

	public Game(String name, int minimalAge) {
		this.name = name;
		this.minimalAge = minimalAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinimalAge() {
		return minimalAge;
	}

	public void setMinimalAge(int minimalAge) {
		this.minimalAge = minimalAge;
	}
}
