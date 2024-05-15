package javaPrograms;

public class MissingNumberInArrat {

	public static void main(String[] args) {
	 
		int a[] = {1,2,3,5,6,7};
		int sum = 0;
		int sum1 =0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
			
		}
		for(int j=0;j<=7;j++) {
			sum1=sum1+j;
			}
		System.out.println("the missing number in series is "+ (sum1-sum));

	}

}
