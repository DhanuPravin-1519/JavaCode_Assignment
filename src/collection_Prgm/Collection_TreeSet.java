/*Assignment 71: WAP to demonstrate TreeSet for its parameters like index, dynamic, null, heterogeneous, 
duplicate and sort*/

package collection_Prgm;

import java.util.Collections;
import java.util.TreeSet;

public class Collection_TreeSet
{

	public static void main(String[] args) 
	{
		TreeSet ts1=new TreeSet();
		/*ts1.add(19);
		ts1.add("Automation");
		ts1.add('f');
		ts1.add(null);
		ts1.add(2.23);
		ts1.add(true);
		ts1.add(19);*/
		
		ts1.add(13);
		ts1.add(34);
		ts1.add(13);
		ts1.add(76);
		ts1.add(34);
		System.out.println(ts1);
		//Collections.sort(ts1);
		System.out.println(ts1);
		

	}

}
