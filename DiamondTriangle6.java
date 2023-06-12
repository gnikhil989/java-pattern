package star_patterns;

import java.util.Scanner;

public class DiamondTriangle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int st = 1;
		int sp = n / 2;
		for (int i = 1; i <= n; i++) {
//			to print spaces
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {
//			to print only first and last star we are using this condition
				if (j == 1 || j == st) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
//					condition for upper triangle
			if (i <= n / 2) {
				sp--;
				st = st + 2;
			}
//					condition for lower triangle
			else {
				sp++;
				st = st - 2;
			}
//					to go on next line
			System.out.println();
		}
	}
}
