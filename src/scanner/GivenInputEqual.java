package scanner;

import java.util.Scanner;

public class GivenInputEqual {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input a: ");
		String a = sc.nextLine();
		
		System.out.println("Enter input b: ");
		String b = sc.nextLine();
		
		if (a==b) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		
	}

}
