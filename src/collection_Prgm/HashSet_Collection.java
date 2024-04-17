/*Assignment 72:WAP to demonstrate HashSet for its parameters like index, dynamic, null, heterogeneous, 
  duplicate and sort*/

package collection_Prgm;

import java.util.Collections;
import java.util.HashSet;

public class HashSet_Collection 
{

	public static void main(String[] args) 
	{
		HashSet hs1=new HashSet();
		hs1.add("hgf");
		hs1.add('l');
		hs1.add(null);
		hs1.add(234);
		hs1.add(9.98);
		hs1.add('l');
		hs1.add(234);
		System.out.println(hs1);

		HashSet hs2=new HashSet();
		hs2.add(98);
		hs2.add(87);
		hs2.add(21);
		hs2.add(234);
		hs2.add(454);
		hs2.add(1);
		hs2.add(234);
		System.out.println(hs2);
		Collections.sort(hs2);
		System.out.println(hs2);
	}

}
