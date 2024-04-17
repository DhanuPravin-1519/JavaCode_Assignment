/*Assignment 73: WAP to demonstrate LinkedHashSet for its parameters like index, dynamic, null, heterogeneous, 
 duplicate and sort*/

 

package collection_Prgm;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSet_Collection 
{

	public static void main(String[] args) 
	{
		LinkedHashSet ls1=new LinkedHashSet();
		ls1.add("dhanu");
		ls1.add('l');
		ls1.add(123);
		
		
		ls1.add("dhanu");
		ls1.add(34);
		ls1.add(null);
		//Collections.sort(ls1);
		System.out.println(ls1);
		
		LinkedHashSet ls2=new LinkedHashSet();
		ls2.add(34);
		ls2.add(12);
		ls2.add(987);
		ls2.add(1);
		System.out.println(ls2);
		//Collections.sort(ls2);
		System.out.println(ls2);
		
		ls1.add("dhanu");
		ls1.add('l');
		ls1.add(123);
		
		
		ls1.add("dhanu");
		ls1.add(34);
		ls1.add(null);
		//Collections.sort(ls1);
		System.out.println(ls1);
			}

}
