package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparingArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> L1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	ArrayList<Integer> L2 = new ArrayList<Integer>(Arrays.asList(2,3,1,4,5,6));
	System.out.println(L1.equals(L2));
	Collections.sort(L1);
	Collections.sort(L2);
	System.out.println(L2.equals(L1));
	
// Compare two Array list, Find out missing value in list 
	ArrayList<Integer> L3 = new ArrayList<Integer>(Arrays.asList(1,4,5,6));
	ArrayList<Integer> L4 = new ArrayList<Integer>(Arrays.asList(1,2,3,5,6));
	L3.removeAll(L4);
	System.out.println(L3);
	
//Find common elements
	ArrayList<String> L5 = new ArrayList<String>(Arrays.asList("Charan","Kumar","Mounika","Babblu"));
	ArrayList<String> L6 = new ArrayList<String>(Arrays.asList("Kumar","Mounika","Babblu"));
	L5.retainAll(L6);
	System.out.println(L5);
		}

}
