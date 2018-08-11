package com.rd.java8_collections;

import java.util.Arrays;
import java.util.List;

public class FilterFindAnyOrElseExercise {

	public static void main( String[] args ){
		List<Game> games = Arrays.asList(new Game("Counter Strike", 18), 
										new Game("Mario Bross", 6),
										new Game("Need For Speed", 12));
	
		//Need to pay attention, the filter will return the first result
		Game result = games.stream().filter(x -> 17 < x.getMinimalAge()).findAny().orElse(null);
		
		Game result2 = games.stream().filter(x -> 30 < x.getMinimalAge()).findAny().orElse(null);
		
		Game multipleConditionsFilter = games.stream().filter( x -> {
			if(x.getMinimalAge() >= 12 && x.getMinimalAge() < 18) {
				return true;
			}
			return false;
		}).findAny()
		.orElse(null);
		
		Game multipleConditionsFilterInline = games.stream().filter(x -> 12 >= x.getMinimalAge() && 18 < x.getMinimalAge()).findFirst().orElse(null);
		
		System.out.println("result: " + result);
		System.out.println("result2: " + result2);
		System.out.println("multipleConditionsFilter: " + multipleConditionsFilter);
		System.out.println("multipleConditionsFilterInline: " + multipleConditionsFilterInline);
	}
}
