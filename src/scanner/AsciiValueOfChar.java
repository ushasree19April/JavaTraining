package scanner;

import java.util.Scanner;

public class AsciiValueOfChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input: ");
		
		char input = sc.next().charAt(0);
        int ascii = (int) input;
        System.out.println("ASCII value of" + input + " is : " + ascii);
        int sum = ascii + 3;
        System.out.println("Added 3 to the Ascii value = " + sum);
        
        System.out.println("Now let us print the character of sum,");
        
        char output = (char) sum;
        
        System.out.println(output);
	}

}
