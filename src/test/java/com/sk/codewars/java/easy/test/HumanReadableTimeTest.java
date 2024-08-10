/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.codewars.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.codewars.java.easy.HumanReadableTime;

/**
* @author - Shreyans Khobare
* Codewars link: https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
*/
class HumanReadableTimeTest {

	private HumanReadableTime subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new HumanReadableTime();
		
	}

	@Test
	void testMakeReadable() {

		assertEquals("00:00:00", subjectUnderTest.makeReadable(0));
		assertEquals("00:00:05", subjectUnderTest.makeReadable(5));
	    assertEquals("00:01:00", subjectUnderTest.makeReadable(60));
	    assertEquals("23:59:59", subjectUnderTest.makeReadable(86399));
	    assertEquals("99:59:59", subjectUnderTest.makeReadable(359999));
		
	}
	
	@Test
	void testMakeReadable_StringFormat() {

		assertEquals("00:00:00", subjectUnderTest.makeReadable_StringFormat(0));
		assertEquals("00:00:05", subjectUnderTest.makeReadable_StringFormat(5));
	    assertEquals("00:01:00", subjectUnderTest.makeReadable_StringFormat(60));
	    assertEquals("23:59:59", subjectUnderTest.makeReadable_StringFormat(86399));
	    assertEquals("99:59:59", subjectUnderTest.makeReadable_StringFormat(359999));
		
	}

}
