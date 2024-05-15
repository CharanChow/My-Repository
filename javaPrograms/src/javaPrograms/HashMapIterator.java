package javaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapIterator {

	public static void main(String[] args) {
		HashMap<String,String>C = new HashMap<String,String>();
		C.put("Charan", "Kumar");
		C.put("Mounika", "Simhadri");
		C.put("Shylaja", "Gorantla");
		
		
	   Iterator<Entry<String,String>>it1=C.entrySet().iterator();
	   while(it1.hasNext()) {
		   Entry<String,String>entry=it1.next();
		   System.out.println(entry.getKey()+" and "+entry.getValue());
	   }
	   
	   Iterator<String>it = C.keySet().iterator();
	   while(it.hasNext()) {
		   String Key =it.next();
		   System.out.println(C.get(Key));
	   }
	   //iterating through lambda function
	   System.out.println("--------------");
	 C.forEach((k,v)->System.out.println(k+" and "+ v));;
	}
	

}
