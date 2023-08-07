package arithmetic;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		int a, b, c, sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 'a' value: ");
		a = sc.nextInt();
		System.out.print("Enter 'b' value: ");
		b = sc.nextInt();
		System.out.print("Enter 'c' value: ");
		c = sc.nextInt();
		sum = a + b + c;
		System.out.println("The sum of a, b and c is:" + sum);
	}
	
	

}
