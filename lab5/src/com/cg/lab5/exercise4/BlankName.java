package com.cg.lab5.exercise4;


public class BlankName {

	public void getFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		try
		{
			if(firstName.length() == 0 && lastName.length() == 0)
			{
				throw new NameException ("First name and last name is blank");
			}
			else
			{
				System.out.println("First name and last name is Not empty");
			}
		}
		catch(NameException e)
		{
			System.out.println(e);
		}
	}

}

@SuppressWarnings("serial")
class NameException extends Exception
{
	public NameException(String string) 
	{
		  System.out.println(string);
	}
}
