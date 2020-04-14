package com.cg.lab5.exercise1;

import java.util.Scanner;

public class TrafficLightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		TrafficLight object=new TrafficLight();	
		scanner.nextLine();
		
		while(true)
		{
			System.out.println("1)Red \n2)Yellow \n3)Green");
			System.out.println(object.getResult(scanner.nextInt()));
			
		}
		
	}

}
