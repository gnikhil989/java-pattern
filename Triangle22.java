package star_patterns;

import java.util.Scanner;

public class Triangle22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Engter the number");
		int n = sc.nextInt();

//	this loop is for number of rows
		for (int i = 1; i <= n; i++) {
			int k = 0;
//	this loop is for printing spaces on the left hand of pattern
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
//	this loop is for printing the stars
				if (j <= i) {

					k++;
					System.out.print(k);
				} else {

					k--;
					System.out.print(k);
				}
			}

//	this print statement is for next line
			System.out.println();
		}

	}

}