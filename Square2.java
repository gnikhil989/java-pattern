package star_patterns;

import java.util.Scanner;

public class Square2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					System.out.print("  ");

				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
