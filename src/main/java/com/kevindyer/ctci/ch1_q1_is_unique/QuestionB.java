package com.kevindyer.ctci.ch1_q1_is_unique;

class QuestionB {
	private QuestionB() {}

	static boolean isUniqueChars(String word) {
		int checker = 0;
		for (int i = 0; i < word.length(); i++) {
			int val = word.charAt(i) - 'a';
			if ((checker  & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

}
