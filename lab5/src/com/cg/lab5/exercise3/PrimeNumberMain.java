package com.cg.lab5.exercise3;

import java.util.Scanner;

public class PrimeNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number :");
	    int number=scanner.nextInt();
	    PrimeNumber obj=new PrimeNumber();  
	    obj.printPrimeNumbers(number);
	    scanner.close();
	}

}
