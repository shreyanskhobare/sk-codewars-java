/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.codewars.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.codewars.java.easy.ValidParentheses;

/**
 * @author - Shreyans Khobare 
 * Codewars link: https://www.codewars.com/kata/52774a314c2333f0a7000688/train/java
 */
class ValidParenthesesTest {

	private ValidParentheses subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {

		subjectUnderTest = new ValidParentheses();

	}

	@Test
	void testValidParentheses() {

		assertEquals(true, subjectUnderTest.validParentheses("()"));
		assertEquals(false, subjectUnderTest.validParentheses("())"));
		assertEquals(true, subjectUnderTest.validParentheses("32423(sgsdg)"));
		assertEquals(false, subjectUnderTest.validParentheses("(dsgdsg))2432"));
		assertEquals(true, subjectUnderTest.validParentheses("adasdasfa"));

	}

}
