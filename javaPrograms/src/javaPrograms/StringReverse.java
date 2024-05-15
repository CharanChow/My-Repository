package javaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String s = "What the Fish";
		int let = s.length();
		String rev ="";
		for(int i =let-1;i>=0;i--) {
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);

	}

}
