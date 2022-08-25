package pinnacle;

import java.util.ListIterator;
import java.util.Vector;

public class Collection_demo {
   public static void main(String[] args) {
	Vector v=new Vector();
	v.add("a");
	v.add(100);
	v.add("rabi");
	System.out.println(v);
	
	
	 
	ListIterator li=v.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println("............................");
	while(li.hasPrevious()) {
		System.out.println(li.previous());
		
	}
	System.out.println("_________________________________");
	
}   
}
