package star_patterns;

public class Pattern11 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int k = n;
			int temp = i;
			for (int j = 1; j <= n; j++) {

				System.out.print(temp + " ");
				--k;
				temp = temp + k;
			}
			System.out.println();
		}
	}

}
