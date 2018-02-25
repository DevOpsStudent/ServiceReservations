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
	
	@Test
	public void pushPopIsEmptyTest() {
		Stack stack = new Stack();
		String expected = "Hello, World!";
		stack.push(expected);
		String actual = stack.pop();
		Boolean result = stack.isEmpty();
		assertTrue("Should be true",result);
	}
	@Test
	public void pushPeekIsEmptyTest() {
		Stack stack = new Stack();
		String expected = "Hello, World!";
		stack.push(expected);
		String actual = stack.peek();
		Boolean result = stack.isEmpty();
		assertFalse("Should be false",result);
	}
}
