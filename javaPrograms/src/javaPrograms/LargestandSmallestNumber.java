package javaPrograms;

public class LargestandSmallestNumber {

	public static void main(String[] args) {

		int a[]= {12,24,34,56,76,79,3};
		int Lr = a[0];
		int sm = a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>Lr) {
				Lr=a[i];
			}
			if(a[i]<sm) {
				sm=a[i];
			}
		}
		System.out.println("Largest Number in given array is "+Lr);
		System.out.println("Smallest number in given array is "+sm);

	}

}
