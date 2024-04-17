/* Assignment 68: WAP to demonstrate Vector for its parameters like index, dynamic, null, heterogeneous, 
  duplicate and sort */
 

package collection_Prgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class VectorCollection 
{

	public static void main(String[] args) 
	{
		
	    Vector v1=new Vector();
	      v1.add(122);
	      v1.add(23);
	      v1.add("Dhruv");
	      v1.add(false);
	      v1.add(null);
	      v1.add('p');
	      v1.add(3.24);
	      v1.add(122);
	      v1.add('p');
	      System.out.println(v1);
	      Vector v2=new Vector();
	      v2.add(23);
	      v2.add(99);
	      v2.add(11);
	      System.out.println(v2);
	      Collections.sort(v2);
	      System.out.println(v2);
	      
	      
	      
	}

}
