package Learning;

import java.util.Scanner;

public class ReverseAStringEqualOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		String reverse = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(reverse);
		if(name==reverse) {
			System.out.println("Given Input is Equal");
		}
		else
			System.out.println("Given Input is Not Equal");
	}

}
