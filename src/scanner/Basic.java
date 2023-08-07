package scanner;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int age;
		float shoeSize;

		System.out.println("Enter your name :");
		name = sc.next();

		System.out.println("your name is: " + name);

	}
}
