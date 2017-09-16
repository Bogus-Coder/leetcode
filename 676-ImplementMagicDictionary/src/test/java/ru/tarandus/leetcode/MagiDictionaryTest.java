package ru.tarandus.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MagiDictionaryTest {

	@Test
	public void testMinSteps() {
		MagicDictionary s = new MagicDictionary();

		s.buildDict(new String[] { "hello", "MagicDictionary", "buildDict", "search", "search", "search", "search" });
		assertTrue(s.search("hhllo"));
		assertFalse(s.search(null));
	}

}
