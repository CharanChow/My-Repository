package testJava;

public class PracticeJava {
	public static void main(String[] args) {
		PracticeJava obj = new PracticeJava();
		int result = obj.Add(25, 89);
		System.out.println(result);
		
		
		
		
		
		
	}

		PracticeJava(){
			System.out.println("inside constructer");
		}
		int Add(int a, int b) {
			
			return a+b;
			
		}
	

}
