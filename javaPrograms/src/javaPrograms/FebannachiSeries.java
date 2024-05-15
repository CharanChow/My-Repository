package javaPrograms;

import java.util.Scanner;

public class FebannachiSeries {

	public static void main(String[] args) {
	int k=0;
	int i=1;
	int j=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value  ");
	int n = sc.nextInt();
	System.out.print("1 1 ");
	while(k<n) {
		k=i+j;
		if(k>=n) {
			break;
		}
		
		System.out.print(k+" ");
		i=j;
		j=k;
		}

	}

}
