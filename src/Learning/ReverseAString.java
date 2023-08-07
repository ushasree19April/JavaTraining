package Learning;

public class ReverseAString {

	public static void main(String[] args) {

		String name = "ABCD";
		String reverse = "";

		char a[] = name.toCharArray();
		for (int i = name.length() - 1; i >= 0; i--) {

			reverse = reverse + a[i];
		}
		System.out.println(reverse);
	}
}
