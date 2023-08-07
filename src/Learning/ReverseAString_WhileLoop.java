package Learning;

public class ReverseAString_WhileLoop {

	public static void main(String[] args) {

		String word = "ILoveYou";
		String reversedString = "";
		int i = word.length() - 1;
		while (i >= 0) {

			reversedString = reversedString + word.charAt(i);
		//	System.out.print("The reversed string of the '" + word + "' is: ");

			i--;
		}
		System.out.print("The reversed string of the '" + word + "' is: ");
		System.out.println(reversedString);

	}

}
