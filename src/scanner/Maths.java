package scanner;

import java.util.Scanner;

public class Maths {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		System.out.println("Enter Breadth: ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		int area = length * breadth;
		System.out.println("Area of rectangle is: " + area);
		
		int perimeter = 2 * area;
		System.out.println("Perimeter of rectangle is: " + perimeter);
	}

}
