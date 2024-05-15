package javaPrograms;

public class StringSwap {

	public static void main(String[] args) {
		String a = "Charan";
		String b = "Mounika";
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swap a is "+a);
		System.out.println("After swap b is "+b);

	}

}
