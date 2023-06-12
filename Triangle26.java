package star_patterns;

import java.util.Scanner;

public class Triangle26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}
}
