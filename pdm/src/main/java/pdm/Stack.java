package pdm;

import java.util.ArrayList;

public class Stack {
ArrayList<String> stack = new ArrayList<String>();
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}
	public void push(String expected) {
		// TODO Auto-generated method stub
		 stack.add(0,expected);
	}

}
