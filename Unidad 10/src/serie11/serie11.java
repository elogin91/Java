package serie11;

public class serie11 {
	public static void main(String[] ar) {

		int x, n, number;
		n = 25;
		x = 1;
		number = 0;
		while (x <= n) {
			number = number + 11;
			System.out.print(number);
			if (x < 25) {
				System.out.print(" - ");
			}

			x++;
		}

	}
}