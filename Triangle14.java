package star_patterns;

public class Triangle14 {

	public static void main(String[] args) {
		int n = 5;
		int sp = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");

			}
			for (int j = i; j <= n; j++) {
				System.out.print(j);

			}
			sp++;
			System.out.println();

		}

	}

}
