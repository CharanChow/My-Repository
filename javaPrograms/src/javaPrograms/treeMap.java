package javaPrograms;

import java.util.Set;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> TM = new TreeMap<>();
		TM.put(1, "Charan");
		TM.put(7, "Dhoni");
		TM.put(10, "Sachin");
		TM.put(23, "Rohit");
		System.out.println(TM);
		System.out.println(TM.headMap(10));
		Set<Integer>s = TM.tailMap(10).keySet();
		System.out.println(s);
		System.out.println(TM.get(23));
		
		
		

	}

}
