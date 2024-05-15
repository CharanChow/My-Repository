package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		primeNumbers(20);
		

	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num % i == 0) {
				return false;
				}
			}
		return true;
	}
	public static void primeNumbers(int num) {
		for(int i=2;i<= num;i++) {
			if(isPrime(i)) {
				System.out.print(i+" " );
			}
		}
	}

}
