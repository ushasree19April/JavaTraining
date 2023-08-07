package Learning;

import java.util.Scanner;

public class ReverseAString_InputString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Input: ");
		
		String name = sc.nextLine();
		
		String reverse = "";
		
		char a[] = name.toCharArray();
		for(int i=name.length()-1; i>=0; i--) {
			
			reverse = reverse + a[i];
			
		}
		System.out.println("Output of your Input is : " + reverse);
	}

}
