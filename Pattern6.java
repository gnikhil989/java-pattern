package star_patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print(k);
				k++;
				if (k > 9) {
					k = 1;
				}
			}
			System.out.println();
		}

	}

}
