package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesinString {

	public static void main(String[] args) {
	 String str ="Charan";
	 String st = "Win-Win";
	System.out.println(duplicates(str));
	System.out.println(duplicates(st));

	}
	public static String duplicates(String str) {
		Set<Character>s = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		for(int i=0;i<str.length();i++) {
		Character c=str.charAt(i);
		if(!s.contains(c)) {
			s.add(c);
			sf.append(c);
		}
		}
		return sf.toString();
	}

}