package star_patterns;

public class Pattern13 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int count = n;
			int temp = i;
			for (int j = 1; j <= n; j++) {
				if (count == n) {
					System.out.print(temp + " ");
					count--;
				} else {
					temp = temp + count;
					System.out.print(temp + " ");
					count--;
				}
			
			}System.out.println();
		}

	}

}
