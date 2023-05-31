package star_patterns;

public class Pattern7 {

		public static void main(String[] args) {
			int n = 5;
			int k = 1;
			for (int i = 1; i <= n; i++) {
				for (int j = n; j >= 1; j--) {
					System.out.print(k%2);
					k++;
					
				}
				System.out.println();
			}

		}

	}


