package utils;

public class StartPattern6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {

			for (int j = i; j <= 6; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 1; i <= 6; i++) {

			for (int j = 0; j <= i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= 6; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}
}
