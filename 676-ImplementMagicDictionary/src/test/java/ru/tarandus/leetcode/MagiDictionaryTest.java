package ru.tarandus.leetcode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MagiDictionaryTest {

	@Test
	public void testMinSteps() {
		MagicDictionary s = new MagicDictionary();

		s.buildDict(new String[] { "hello", "MagicDictionary", "buildDict", "search", "search", "search", "search" });
		assertTrue(s.search("hhllo"));
		assertFalse(s.search(null));
	}

}
