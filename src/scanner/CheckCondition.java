package scanner;

import java.util.Scanner;

public class CheckCondition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();

		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		if (a < 50 && a < b) {
			System.out.println("a is less than 50 and a is less than b");
		} else {
			System.out.println("a is either greater than or equal to 50 or not less than 'b'");
		}

		if (a < 50 || a < b) {
			System.out.println("a is less than 50 or a is less than b");
		} else {
			System.out.println("a is not less than 50 ");
		}

	}

}
