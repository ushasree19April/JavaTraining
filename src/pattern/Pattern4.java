package pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i++) { // outer row
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			

			System.out.println();
		}
	}

}
