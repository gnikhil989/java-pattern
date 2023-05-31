package star_patterns;

public class Star1 {

	public static void main(String[] args) {
		int n = 4;
		int sp = 0;
		int st = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= st; j++)
				System.out.print("* ");
			for (int k = 1; k <= sp * 2; k++)
				System.out.print(" ");
			for (int l = 1; l <= st; l++)
				System.out.print("* ");
			sp = sp + 2;
			st--;
			System.out.println();
		}
	}

}
