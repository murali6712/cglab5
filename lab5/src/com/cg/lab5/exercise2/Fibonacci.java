package com.cg.lab5.exercise2;

public class Fibonacci {

	public int getFibonacciNormal(int value) {
		// TODO Auto-generated method stub
		int digit = 0, firstValue = 1, secondValue = 1, temporary = 0;
		for (int index = 0; index < value-2; index++)
		{
			temporary = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = temporary;
		}
		digit = temporary;
		return digit;
	}

	public int getFibonacciRecursive(int first, int second, int value) {
		// TODO Auto-generated method stub
		if(value == 2)
	    	return second;
	    else
	    	value--;
	    	return getFibonacciRecursive(second,first+second,value);
	}

}
