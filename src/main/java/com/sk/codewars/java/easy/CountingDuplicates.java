/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.codewars.java.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* @author - Shreyans Khobare
* Codewars link: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
*/
public class CountingDuplicates {
	
	  public int duplicateCount(String text) {
		    // Write your code here
		  Set<String> first = new HashSet<String>();
		  Set<String> multiple = new HashSet<String>();
		  String[] characters = text.toLowerCase().split("");
		  
		  int duplicates = 0;
		  for (String val : characters) {
			  
			  if (multiple.contains(val)) {
				  continue;
			  } else if (first.contains(val)) {
				  duplicates++;
				  multiple.add(val);
			  } else {
				  first.add(val);
			  }
			  
		  }
		  
		  return duplicates;
	
	  }
	  
	  
	  public int duplicateCount_Stream(String text) {
		    // Write your code here
	        List<String> list = Arrays.asList(text.toLowerCase().split(""));
	        return (int) list.stream().filter(s -> Collections.frequency(list, s) > 1).distinct().count();
	
	  }

}
