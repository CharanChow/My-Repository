package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		//comparing each elements 
		String a[]= {"java","C","java","Python","Charan","Charan"};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])){
					System.out.println("Duplicate string is "+a[i]);
				}
			}
		}
		
		//Using Set, its a java collection
		Set<String> s = new HashSet<String>();
		for(String name : a) {
			if(s.add(name) == false) {
				System.out.println("Duplicate string is "+name);
			}
		}
 
		//Using map
		Map<String,Integer> m = new HashMap<String,Integer>();
		for(String name : a) {
			Integer count = m.get(name);
			if(count == null) {
				m.put(name, 1);
			}
			else {
				m.put(name, ++count);
			}
		}
		Set<Entry<String,Integer>> entrySet =m.entrySet();
		for(Entry<String,Integer>entryset : entrySet){
			if(entryset.getValue()>1) {
				System.out.println("Duplicate string is "+entryset.getKey());
				
			}
			
		}
		}
			
	

}
