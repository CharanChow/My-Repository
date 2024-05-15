package javaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ComparingTwoHashMaps {

	public static void main(String[] args) {
	HashMap<Integer,String>Map1 = new HashMap<Integer,String>();
	Map1.put(1,"Chow");
	Map1.put(2, "Charan");
	Map1.put(3, "kumar");
	HashMap<Integer,String>Map2 = new HashMap<Integer,String>();
	Map2.put(1, "Charan");
	Map2.put(2, "Chow");
	Map2.put(3, "kumar");
	Map2.put(4, "Sachin");
	HashMap<Integer,String>Map3 = new HashMap<Integer,String>();
	Map3.put(1, "Charan");
	Map3.put(2, "Chow");
	Map3.put(3, "kumar");
	Map3.put(4, "Sachin");
	Map3.put(5, "Scahin");
	//Map3.put(5, "Sachin");
	
	System.out.println(Map1.equals(Map2));
	System.out.println(Map1.equals(Map3));
	System.out.println(Map1.keySet().equals(Map3.keySet()));
	//finding extra key between two Hashmap
	HashSet<Integer>Extra=new HashSet<Integer>(Map3.keySet());
	Extra.removeAll(Map1.keySet());
	System.out.println(Extra);
	System.out.println(new ArrayList<String>(Map3.values()).equals(new ArrayList<String>(Map2.values())));
	System.out.println(new HashSet<>(Map2.values()).equals(new HashSet<>(Map3.values())));
	
	

	}

}