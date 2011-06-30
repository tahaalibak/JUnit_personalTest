package de.vogella.junit.first;

public class MyClass {
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		
		if (y!=0){
			return x / y;	
		}
		else{
			throw new IllegalArgumentException();
		}
		
	}
}