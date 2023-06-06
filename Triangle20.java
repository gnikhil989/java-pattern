package star_patterns;

import java.util.Scanner;

public class Triangle20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Engter the number");
		int n = sc.nextInt();
//	this loop is for number of rows
		for (int i = 1; i <= n; i++) {
//	this loop is for printing spaces on the left hand of pattern
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
//	this loop is for printing the stars
				System.out.print(i % 2);
			}
//	this print statement is for next line
			System.out.println();
		}
	}

}
