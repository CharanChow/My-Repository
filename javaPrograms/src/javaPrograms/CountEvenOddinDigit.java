package javaPrograms;

import java.util.Scanner;

public class CountEvenOddinDigit {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Oddcount =0,Evencount=0;
	System.out.println("Enter a value");
	int num = sc.nextInt();
	while(num>0) {
		int r =num%10;
		if(r%2==0) {
			Evencount++;
		}
		else {
			Oddcount++;
		}
		num=num/10;
	}
	System.out.println("number of even digits - "+Evencount+"   number of odd digit - "+Oddcount);

	}

}