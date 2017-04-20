package com.kevindyer.ctci.ch1_q1_is_unique;

import java.util.HashSet;
import java.util.Set;

class QuestionA {
	private QuestionA() {}

	static boolean isUniqueChars(String word) {
		Set<Character> uniqueCharacters = new HashSet<>();
		for (Character wordCharacter : word.toCharArray()) {
			if (uniqueCharacters.contains(wordCharacter)) {
				return false;
			} else {
				uniqueCharacters.add(wordCharacter);
			}
		}
		return true;
	}
}
