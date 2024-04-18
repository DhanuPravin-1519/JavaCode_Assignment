//Write a program to demonstrate encapsulation

package assignment_package;

class privateData
{
	private String U_Name="born@oct28"; ////U_Name is global variable 
	public void setU_Name(String U_Name)//U_Name is local variable 
	{
		this.U_Name=U_Name;
	}
	
	public String getU_Name()
	{
		return U_Name;
	}
	
}

public class Ab_39Assignment64 
{

	public static void main(String[] args) 
	{
		privateData pd1=new privateData();
		pd1.setU_Name("Born@2810");
        System.out.println(pd1.getU_Name());
	}

}
