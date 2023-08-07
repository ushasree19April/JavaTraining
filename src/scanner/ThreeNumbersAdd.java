package scanner;

import java.util.Scanner;

public class ThreeNumbersAdd {
	
	public static void main(String[] args) {
		
		int a, b, c, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a: ");
		a = sc.nextInt();
		System.out.println("Enter value b: ");
		b = sc.nextInt();
		System.out.println("Enter value c: ");
		c = sc.nextInt();
		
		sum = a+b+c;
		System.out.println("Sum of a, b and c is :" + sum);
		
	}

}
