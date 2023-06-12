package star_patterns;

import java.util.Scanner;

public class DiamondTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int st = 1;

		int sp = n / 2;
		for (int i = 1; i <= n; i++) {
//				to print spaces
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
//				to print number and that number is starting from 1 so , it should from 1,therefore we have to initialize before printing loop
			int m = 1;
			for (int j = 1; j <= st; j++) {
				System.out.print(m);
//				this condition is for incrementing and decrementing the number
				if (j <= st / 2) {
					m++;
				} else {
					m--;
				}
			}

//				condition for upper triangle
			if (i <= n / 2) {
				sp--;
				st = st + 2;
			}
//				condition for lower triangle
			else {
				sp++;
				st = st - 2;
			}
//				to go on next line
			System.out.println();
		}

	}

}
