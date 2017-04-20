package com.kevindyer.ctci.ch1_q1_is_unique;

public class Tester {

	public static void main(String[] args) {
		// If not able to use alternate data structure then;
		//   1) sort in place and look for duplicate neighbors O(n log n)
		//   2) iterate over each character checking each other character O(n^2)
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			boolean wordA  = QuestionA.isUniqueChars(word);
			boolean wordB  = QuestionB.isUniqueChars(word);
			if (wordA == wordB) {
				System.out.println(word + ": " + wordA);
			} else {
				System.out.println(word + ": " + wordA + " vs " + wordB);
			}
		}
	}
}
