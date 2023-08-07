package arithmetic;

import java.util.Scanner;

public class DiffAndProduct {
	
	public static void main(String[] args) {
		int a, b, diff, prod;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 'a' value: ");
		a = sc.nextInt();
		System.out.print("Enter 'b' value: ");
		b = sc.nextInt();
		diff = a - b;
		prod = a*b;
		System.out.println("The difference of a, b is = " + diff);
		System.out.println("The product of a, b is = " + prod);
	}
	

}
