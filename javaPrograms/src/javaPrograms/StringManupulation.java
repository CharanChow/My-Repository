package javaPrograms;

public class StringManupulation {

	public static void main(String[] args) {
		String str = "101 ways to enjoy life ,learn and leave";
		String str1 = "101 ways to enjoy Life ,Learn and Leave";
		// to find the length of string we use .length method, return type is integer
		System.out.println(str.length());
		//To know the character at particular index we use charAt
		System.out.println(str.charAt(6));

		// To know the index of character we use indexOf
		System.out.println(str.indexOf("l"));
		//They are two "y" in given string if we want to know second Y the we use following 
		int so = str.indexOf('l', str.indexOf("l")+1);
		System.out.println(so);
		System.out.println(str.indexOf("l", so+1));
		System.out.println(str.indexOf("ways"));
		// String comparison we use equals method
		System.out.println(str.equals(str1));
		//If we want to ignore case sensitive we use equalsignorecase method 
		System.out.println(str.equalsIgnoreCase(str1));
		
		// if we want a substring from string we use substring method 
		System.out.println(str.substring(4, 8));
		String s = " Consistancy is the key ";
		String o = s.trim();
		String m = o.replace(" ", "");
		System.out.println(m);
		// return type of split() is array of strings
		String text= "HardWork_Persistance_Determination_Effort";
		String t[]=text.split("_");
		for(int i=0;i<=t.length-1;i++) {
			System.out.println(t[i]);
		}
	}

}
