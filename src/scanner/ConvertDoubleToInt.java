package scanner;

import java.util.Scanner;

public class ConvertDoubleToInt {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Double value: ");
		Double input = sc.nextDouble();
		
		int output = input.intValue();
		System.out.println("Converted double value into integer : " + output);
		
		
	}

}
