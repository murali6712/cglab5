package com.cg.lab5.exercise3;

public class PrimeNumber {
	void printPrimeNumbers(int value)
	{
		int prime;
		for(int index=2;index<value;index++)
		{
			prime=0;
			for(int loop=2;loop<index;loop++)
			{
				if(index % loop==0)
					prime=1;
			}
			if(prime==0)
				System.out.println(index);
		}
	}
}
