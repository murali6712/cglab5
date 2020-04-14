package com.cg.lab5.exercise5;

import java.util.Scanner;

public class AgeValidationMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=scanner.nextInt();
		AgeValidation obj=new AgeValidation();
	    obj.getAgeValidation(age);
		scanner.close();
	}

}

