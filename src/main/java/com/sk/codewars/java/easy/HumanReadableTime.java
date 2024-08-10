/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.codewars.java.easy;

import java.text.DecimalFormat;

/**
 * @author - Shreyans Khobare Codewars link:
 *         https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
 */
public class HumanReadableTime {

	public String makeReadable(int seconds) {
		// Do something
		int hour = (seconds / (60 * 60));
		int remaining = (seconds % (60 * 60));
		int minutes = (remaining / (60));
		remaining = (remaining % (60));

		DecimalFormat df = new DecimalFormat("#00");
		return df.format(hour) + ":" + df.format(minutes) + ":" + df.format(remaining);

	}

	public String makeReadable_StringFormat(int seconds) {
		// Do something
		int hour = (seconds / (60 * 60));
		int remaining = (seconds % (60 * 60));
		int minutes = (remaining / (60));
		remaining = (remaining % (60));

		DecimalFormat df = new DecimalFormat("#00");
		return String.format("%02d", hour) + ":" + String.format("%02d",minutes) + ":" + String.format("%02d",remaining);

	}

}
