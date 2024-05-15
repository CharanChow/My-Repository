package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesInArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Charan","kumar","mouika","Charan"));
       LinkedHashSet<String> WN = new LinkedHashSet<String>(names);
       ArrayList<String> WN1 = new ArrayList<String>(WN);
       System.out.println(WN1);
       
       ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1,11,11,2,33,33,24,24,25));
     List<Integer>Uni=  marks.stream().distinct().collect(Collectors.toList());
     System.out.println(Uni);
	}

}
