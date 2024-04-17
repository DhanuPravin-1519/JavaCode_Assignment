/*Assignment 67: WAP to demonstrate ArrayList for its parameters like index, dynamic, null, heterogeneous, 
duplicate and sort*/

package collection_Prgm;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayList 
{

	public static void main(String[] args) 
	{
      ArrayList a1=new ArrayList();
      a1.add(122);
      a1.add(23);
      a1.add("Dhruv");
      a1.add(false);
      a1.add(null);
      a1.add('p');
      a1.add(3.24);
      a1.add(122);
      a1.add('p');
      System.out.println(a1);
      
      ArrayList a2=new ArrayList();
      a2.add(12);
      a2.add(76);
      a2.add(1);
      Collections.sort(a2);
      System.out.println(a2);
      
     /* a1.add(100);
      a1.add(23);
      a1.add("Dhruv");
      a1.add(false);
      a1.add(null);
      a1.add('p');
      a1.add(3.24);
      a1.add(122);*/
      ArrayList a3=new ArrayList();
      a3.add("asd");
      System.out.println(a3);
      
     /* a1.add(122);
      a1.add(23);
      a1.add("Dhruv");
      a1.add(false);
      a1.add(null);
      a1.add('p');
      a1.add(3.24);
      a1.add(122);
      a1.add('p');
      System.out.println(a1);*/

	}

}
