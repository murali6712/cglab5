package com.cg.lab5.exercise1;

public class TrafficLight {

	public String getResult(int user) {
		// TODO Auto-generated method stub
		switch(user)
		{
		case 1:
			return "Stop";
		case 2:
			return "Ready";
		case 3:
			return "Go";
		default :
				return "Please Enter the valid Input";
		}
	}
	
}
