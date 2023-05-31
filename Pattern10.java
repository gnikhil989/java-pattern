package star_patterns;

public class Pattern10 {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();
		}
	}
}
