/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.codewars.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.codewars.java.easy.EqualSidesOfAnArray;

/**
* @author - Shreyans Khobare
* Codewars link: https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
*/
class EqualSidesOfAnArrayTest {

	private EqualSidesOfAnArray subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new EqualSidesOfAnArray();
		
	}

	@Test
	void testFindEvenIndex() {
		
		assertEquals(3,subjectUnderTest.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,subjectUnderTest.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,subjectUnderTest.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(3,subjectUnderTest.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,subjectUnderTest.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,subjectUnderTest.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,subjectUnderTest.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
		
	}
	
	@Test
	void testFindEvenIndex_Better() {
		
		assertEquals(3,subjectUnderTest.findEvenIndex_Better(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,subjectUnderTest.findEvenIndex_Better(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,subjectUnderTest.findEvenIndex_Better(new int[] {1,2,3,4,5,6}));
        assertEquals(3,subjectUnderTest.findEvenIndex_Better(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,subjectUnderTest.findEvenIndex_Better(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,subjectUnderTest.findEvenIndex_Better(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,subjectUnderTest.findEvenIndex_Better(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
		
	}

}
