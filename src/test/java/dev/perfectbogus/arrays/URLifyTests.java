package dev.perfectbogus.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class URLifyTests{

	@Test
	public void testNoSpaces(){
		char[] before = {'n', 'a', 'm', 'e'};
		char[] after = {'n', 'a', 'm', 'e'};
		char[] processed = URLify.replaceSpaces(before, 4);
		assertArrayEquals(processed,after);
	}

	@Test
	public void testSpace(){
		char[] before = {'n', 'a', ' ', 'm', 'e', ' ', ' ', ' '};
		char[] after = {'n', 'a', '%', '2', '0', 'm', 'e', ' '};
		char[] processed = URLify.replaceSpaces(before, 5);
		assertArrayEquals(processed, after);
	}
}