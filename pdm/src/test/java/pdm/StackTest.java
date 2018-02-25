package pdm;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void isEmptyTest() {
		Stack stack = new Stack();
		Boolean actual = stack.isEmpty();
		assertTrue("Should be true",actual);
	}
	@Test
	public void pushIsEmptyTest() {
		Stack stack = new Stack();
		String expected = "Hello, World!";
		stack.push(expected);
		Boolean result = stack.isEmpty();
		assertFalse("Should be false",result);
	}
}
