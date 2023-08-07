package scanner;

import java.util.Scanner;

public class SquareOfInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input: ");
		int input = sc.nextInt();
		
		System.out.println("Square of given input :" + input * input);
	}

}
