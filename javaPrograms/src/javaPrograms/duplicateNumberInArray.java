package javaPrograms;

public class duplicateNumberInArray {

	public static void main(String[] args) {
		int a[] = {1,2,4,31,32,32,31,2,4,0,-1,-1};
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]+"  is duplicate number");
				}
			}
		}

	}

}
