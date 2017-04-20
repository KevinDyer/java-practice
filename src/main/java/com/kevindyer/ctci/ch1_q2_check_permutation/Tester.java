package com.kevindyer.ctci.ch1_q2_check_permutation;

public class Tester {
	public static void main(String[] args) {
		String input = "abcde";
		String[] words = {"abcdef", "kite", "abbcde"};
		
		for (String word : words) {
			System.out.println(word + ": " + input);
			
		}
	}
}
