/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.codewars.java.easy;

/**
 * @author - Shreyans Khobare 
 * Codewars link: https://www.codewars.com/kata/52774a314c2333f0a7000688/train/java
 */
public class ValidParentheses {

	public boolean validParentheses(String parens) {
		// Put code below
		int countOpen = 0;
		int countClose = 0;
		String[] characters = parens.split("");
		for (String val : characters) {
			if (val.equals("(")) {

				countOpen++;

			} else if (val.equals(")")) {

				countClose++;
				if (countClose > countOpen) {
					return false;
				}

			}
		}
		
		if (countClose != countOpen) {
			return false;
		}
		return true;
	}

}
