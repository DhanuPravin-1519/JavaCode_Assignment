//WAP for throw and throws  keyword

package assignment_package;

public class Ab_39Assignment60 
{

	public static void main(String[] args) throws NullPointerException
	{
		int age=17;
		if (age>18)
		{
		System.out.println("Enrty validated");	
		}
		//throw new ArithmeticException();
		throw new NullPointerException("Element is not holding any value");

	}

}
