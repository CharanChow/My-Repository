package javaPrograms;


public class SwapElementsInArray {

	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,4,5,6,7};
		swap(a, 1, 4);
		printarr(a);
		
	}
	public static void swap(int a[],int i, int j) {
		if( i <0 || i>a.length-1) 
			return;
		if(j<0 || j>a.length-1)
			return;
		int temp = a[i];
		a[i] = a[j];
		a[j]=temp;	
	}
	public static void printarr(int a[]) {
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

