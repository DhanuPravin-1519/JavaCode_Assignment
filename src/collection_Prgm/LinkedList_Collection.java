/*Assignment 69: WAP to demonstrate LinkedList for its parameters like index, dynamic, null, heterogeneous, 
duplicate and sort*/

package collection_Prgm;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Collection 
{
public static void main(String[] args) 
{
	LinkedList l1=new LinkedList();
	
	 l1.add(122);
     l1.add(23);
     l1.add("Dhruv");
     l1.add(false);
     l1.add(null);
     l1.add('p');
     l1.add(3.24);
     l1.add(122);
     l1.add('p');
     System.out.println(l1);
     
     LinkedList l2=new LinkedList();
     l2.add(98);
     l2.add(21);
     l2.add(101);
     System.out.println(l2);
     Collections.sort(l2);
     System.out.println(l2);
}
}
