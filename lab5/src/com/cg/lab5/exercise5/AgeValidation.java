package com.cg.lab5.exercise5;

public class AgeValidation {

	public void getAgeValidation(int age){
		// TODO Auto-generated method stub
		try
		  {
			  if(age<15)
			  {
				  throw new AgeException("Age cannot be below 15 years!!");
			  }
				  
			  else
			  {
				  System.out.println("Your age is eligible !!");
			  }
				 
			  
		  }
		  catch(AgeException e)
		  {
			  System.out.println(e);
		  }
	}

}

@SuppressWarnings("serial")
class AgeException extends Exception {
	public AgeException(String str) 
	{
		  System.out.println(str);
	}
}

