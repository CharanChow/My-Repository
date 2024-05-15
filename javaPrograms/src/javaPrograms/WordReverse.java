package javaPrograms;

public class WordReverse {

	public static void main(String[] args) {
		String str = "Never Ever Doubt Yourself Don't";
		String s[]=str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+ " ");
		}

	}

}
