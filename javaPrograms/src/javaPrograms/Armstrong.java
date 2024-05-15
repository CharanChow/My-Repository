package javaPrograms;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		armstrong(153);
		armstrong(121);
		armstrong(370);
		armstrong(371);
	}
	public static void armstrong(int num) {
		int r=0;
		int sum =0;
		int t=num;
		while(num>0) {
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		if ( t==sum) {
			System.out.println("the given number is Armstrong");
		}
		else {
			System.out.println("the given number is not Armstrong");
		}
	}

}
