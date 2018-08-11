package com.rd.java8_collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollectExercise 
{
    public static void main( String[] args ){
    	
    	//Learning convert, filter and collect
    	
    	List<String> tech = Arrays.asList("java","es6", "react", "nodejs");
    	String filter = "java";
    	
    	List<String> result = tech.stream() 				//convert to stream
    			.filter(line -> !filter.equals(line))		//filtering
    			.collect(Collectors.toList());				//collect
    	
    	result.forEach(System.out::println);
    }
}
