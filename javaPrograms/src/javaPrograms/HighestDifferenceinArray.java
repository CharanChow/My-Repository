package javaPrograms;

public class HighestDifferenceinArray {

	public static void main(String[] args) {
	int a[]= {10,1,30,40,70,90};
	int max =0;
	for(int i =0;i<a.length;i++) {
		for(int j =i+1;j<a.length;j++) {
			int z = a[j]-a[i];
			if(z>max) {
				max = z;
				
			}
		}
	}
	System.out.println(max+ " is highest difference in given array");

	}

}
