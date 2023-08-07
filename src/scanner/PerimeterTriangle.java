package scanner;

import java.util.Scanner;

public class PerimeterTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		Double a = sc.nextDouble();
		
		System.out.println("Enter b value: ");
		Double b = sc.nextDouble();
		
		System.out.println("Enter c value: ");
		Double c = sc.nextDouble();
		
		//perimeter of triangle is a+b+c
		Double sum = a+b+c;
		
		System.out.println("perimeter of triangle is = " + sum );
	}

}
