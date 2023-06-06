package star_patterns;

import java.util.Scanner;

public class Triangle23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Engter the number");
		int n = sc.nextInt();

//	this loop is for number of rows
		for (int i = 1; i <= n; i++) {
			int k = 0;
//	this loop is for printing spaces on the left hand of pattern
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}for (int j = i-1;j>0; j--) {
				System.out.print(j);
				
			}System.out.println();
				
			}

	}

}
