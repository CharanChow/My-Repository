package javaPrograms;

public class Pallandrom {

	public static void main(String[] args) {
	isPallandrom(12121);
	isPallandrom(123);
	isPallandrom(12);

	}
	
	public static void isPallandrom(int num) {
		int r=0;
		int sum=0;
		int t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num = num/10;
		}
		if(t == sum) {
			System.out.println("The given number is pallandrom");
		}
		else {
			System.out.println("the given numer is not pallandrom");
		}
		
	}

}
