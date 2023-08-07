package scanner;

import java.util.Scanner;

public class Ascii {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Input: ");
		char input = sc.next().charAt(0);
        int ascii = (int) input;

        System.out.println("ASCII value of '" + input + "' is: " + ascii);
		
		
	}

}
