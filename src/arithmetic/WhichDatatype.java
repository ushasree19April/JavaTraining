package arithmetic;

import java.util.Scanner;

public class WhichDatatype {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit:  ");
		String input = sc.nextLine();
		
		if(input.length() == 1) {
			char character = input.charAt(0);
			
			if (Character.isDigit(character)) {
				 System.out.println("Integer");
            } else {
                System.out.println("Char");
            }
			
        } else {
        	 try {
                 double d = Double.parseDouble(input);
                 System.out.println("Double");
             } catch (RuntimeException Exception) {
                 System.out.println("String");
            }
        }

        sc.close();
    }
}

