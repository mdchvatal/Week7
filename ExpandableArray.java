package week6;

import acm.program.ConsoleProgram;
import java.util.Arrays;

public class ExpandableArray{
	
	private Object[] starterArray = new Object[0]; 
	
	public ExpandableArray() {
	}
	
	public void set(int index, Object value) {
		if (index >= starterArray.length) {
			Object[] tempArray = Arrays.copyOfRange(starterArray, 0, index));
			starterArray = tempArray;
		} else {
			starterArray[index] = value;
		}
	}
	
	public Object get(int index) {
		if (index > starterArray.length) {
			return null;
		} else {
			return starterArray[index];
		}
	}

}
