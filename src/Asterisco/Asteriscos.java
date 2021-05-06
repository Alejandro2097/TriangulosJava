package Asterisco;

public class Asteriscos {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("//////// A ///////////");
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("//////// B ///////////");
		for (int i = 1; i <= n; i++) {
			for (int x = 0; x < i; x++) {
				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("//////// C ///////////");
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int x = 0; x < (2 * i) - 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("//////// D ///////////");
		int y = n / 2;
		if (n % 2 != 0)
			y = (n / 2) + 1;

		for (int i = 0; i <= (n / 2); i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int x = 0; x < (2 * i) - 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = y; i >= 1; i--) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int x = 0; x < (2 * i) - 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
