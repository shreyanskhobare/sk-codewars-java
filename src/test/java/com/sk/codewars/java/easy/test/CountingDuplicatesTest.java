/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.codewars.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.codewars.java.easy.CountingDuplicates;

/**
* @author - Shreyans Khobare
* Codewars link: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
*/
class CountingDuplicatesTest {

	private CountingDuplicates subjectUnderTest;
	
	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new CountingDuplicates();
		
	}

    @Test
    public void testDuplicateCount_abcdeReturnsZero() {
        assertEquals(0, subjectUnderTest.duplicateCount("abcde"));
    }
    
    @Test
    public void testDuplicateCount_abcdeaReturnsOne() {
        assertEquals(1, subjectUnderTest.duplicateCount("abcdea"));
    }
    
    @Test
    public void testDuplicateCount_indivisibilityReturnsOne() {
        assertEquals(1, subjectUnderTest.duplicateCount("indivisibility"));
    }
    
    @Test 
    public void testDuplicateCount_reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A'); 
        String test1d = new String(new char[1]).replace('\0', 'd'); 
        String test = test1d + test1CapitalA + testTenC + 
            testHundredB + testThousandA;
        

        assertEquals(3, subjectUnderTest.duplicateCount(test));
    }
    
    @Test
    public void testDuplicateCount_Stream() {
    	
    	assertEquals(0, subjectUnderTest.duplicateCount_Stream("abcde"));
    	assertEquals(1, subjectUnderTest.duplicateCount_Stream("abcdea"));
    	assertEquals(1, subjectUnderTest.duplicateCount_Stream("indivisibility"));
    	
    	String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A'); 
        String test1d = new String(new char[1]).replace('\0', 'd'); 
        String test = test1d + test1CapitalA + testTenC + 
            testHundredB + testThousandA;
        

        assertEquals(3, subjectUnderTest.duplicateCount_Stream(test));
    	
    }

}
