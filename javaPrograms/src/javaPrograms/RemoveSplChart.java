package javaPrograms;

public class RemoveSplChart {

	public static void main(String[] args) {
	
		
		String s = "&&Determiniation&&Consistant$$HardWork&&";
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);

	}

}
