package pdm;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		Stack stack = new Stack();
		Boolean actual = stack.isEmpty();
		assertTrue("Should be true",actual);
	}

}
