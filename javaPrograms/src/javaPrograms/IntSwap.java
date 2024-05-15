package javaPrograms;

public class IntSwap {

	public static void main(String[] args) {
		int a = 44;
		int b = 20;
		
		
		
		//without third variable
		a = a*b;
		b= a/b;
		a= a/b;
		System.out.println("value of a after swap is "+a);
		System.out.println("value of b after swap is "+b);
			}

}
