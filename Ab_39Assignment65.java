//Write a program to demonstrate this calling statement

package assignment_package;

public class Ab_39Assignment65
{
	Ab_39Assignment65()
	{
		System.out.println("Constructor1");
	}
	
	Ab_39Assignment65 (int a)
	{
		this();
		System.out.println("Constructor2");
	}
	
	Ab_39Assignment65 (int a, double d)
	{
		this(7);
		System.out.println("Constructor3");
	}
	
	public static void main(String[] args) 
	{
		new Ab_39Assignment65(5,2.2);

	}

}
