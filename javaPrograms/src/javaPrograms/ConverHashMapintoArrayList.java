package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConverHashMapintoArrayList {

	public static void main(String[] args) {
		HashMap<String,Integer>Map = new HashMap<>();
		Map.put("Charan", 28);
		Map.put("Mounika", 29);
		Map.put("Shylaja", 52);
		
		List<String>L=new ArrayList<String>(Map.keySet());
		for(String t : L){
			System.out.println(t);
			
		}
		System.out.println(L);
		
		
	//Converting HashMap values into array list
		List<Integer>Value = new ArrayList<Integer>(Map.values());
		System.out.println(Value);
	}

}
