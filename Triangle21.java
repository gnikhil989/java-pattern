package star_patterns;

import java.util.Scanner;

public class Triangle21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Engter the number");
		int n = sc.nextInt();
		int k = 1;
//	this loop is for number of rows
		for (int i = 1; i <= n; i++) {
//	this loop is for printing spaces on the left hand of pattern
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
//	this loop is for printing the stars
				System.out.print(k % 2);
				k++;
			}
//	this print statement is for next line
			System.out.println();
		}

	}

}
