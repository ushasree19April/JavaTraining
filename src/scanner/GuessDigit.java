package scanner;

import java.util.Scanner;

public class GuessDigit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input: ");
		
		String input = sc.nextLine();
		
		if (isInteger(input)) {
			System.out.println(input + " is an integer");
		}
			else if(isChar(input)) {
				System.out.println(input + " is a char");
			}
			else if(isDouble(input)) {
				System.out.println(input + " is a double");
			
		}
			else {
				System.out.println("Not Integer, Char or Double");
			}
		
	}

	private static boolean isDouble(String input) {
		 try {
	            Double.parseDouble(input);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}

	private static boolean isChar(String input) {
		  return input.length() == 1;
	}

	private static boolean isInteger(String input) {
		 try {
	            Integer.parseInt(input);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}

}
