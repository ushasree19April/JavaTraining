package arithmetic;

import java.util.Scanner;

public class TypeConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double value = ");
		Double d = sc.nextDouble();

		int value = Double.valueOf(d).intValue();
		System.out.println("Converted into value " + value);

	}

}
