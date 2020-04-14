package com.cg.lab5.exercise2;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Fibonacci object = new Fibonacci();
		System.out.println("Fibonacci using normal method is " + object.getFibonacciNormal(scanner.nextInt()));
		System.out.println("Fibonacci using Recursive method is " + object.getFibonacciRecursive(scanner.nextInt(), 
				scanner.nextInt(), scanner.nextInt()));
		
		scanner.close();
	}

}
