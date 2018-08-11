package com.rd.java8_collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMap {
	
	public static void main(String[] args) {
		
		List<Game> games = Arrays.asList(new Game("Counter Strike", 18), 
				new Game("Mario Bross", 6),
				new Game("Need For Speed", 12));
		
		String name = games.stream().filter(x -> "Counter Strike".equals(x.getName())).map(Game::getName).findAny().orElse(null);
		
		System.out.println("Name: " + name);
		
		List<String> collect = games.stream().map(Game::getName).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
	}

}
