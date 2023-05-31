package star_patterns;

public class Star2 {

	public static void main(String[] args) {
		int n = 4;
		int sp = 0;
		int st = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= st; j++) {
				if (i < n) {
					for (int k = 1; k <= sp; k++) {
						System.out.print("");
						sp++;
						System.out.print("* ");
						st = st - 2;
					}
				}
			}
			System.out.println();
		}

	}
}
