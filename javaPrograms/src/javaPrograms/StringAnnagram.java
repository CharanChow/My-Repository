package javaPrograms;

import java.util.Arrays;

public class StringAnnagram {

	public static void main(String[] args) {
		String s1="Charan";
		String s2 ="narahC";
		isAnnagram(s1,s2);
		

	}
	public static void isAnnagram(String s1, String s2) {
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println(s1+"  is annagram");
		}
		else {
			System.out.println(s1+" is not annagram");
		}
	}

}
