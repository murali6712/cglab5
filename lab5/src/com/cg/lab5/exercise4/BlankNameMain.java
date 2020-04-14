package com.cg.lab5.exercise4;

import java.util.Scanner;

public class BlankNameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter FirstName:");
	    String firstName=scanner.nextLine();
	    System.out.println("Enter LastName:");
	    String lastName=scanner.nextLine();
	    BlankName obj=new BlankName();
	    obj.getFirstNameAndLastName(firstName, lastName);
	    scanner.close();
	}

}
