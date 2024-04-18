//Try to find area of circle using PI from Math.PI, and radius from Math.random in the for loop  for 10 times.

package assignment_package;

public class Ab_39Assignment62 
{

	public static void main(String[] args) 
	{
		double pi=Math.PI;
		//double radious=Math.random();
		double areaofCircle;
		for(int i=1;i<=10;i++)
		{
			areaofCircle=pi*Math.random()*Math.random();
			System.out.println(areaofCircle);
		}
		

	}

}
