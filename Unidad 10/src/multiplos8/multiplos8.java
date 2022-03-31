package multiplos8;

public class multiplos8 {

	public static void main(String[] ar) {

		int number;
		boolean firstExecution = true;

		number = 0;
		while (number <= 500) {
			number = number + 8;
			if (number < 500) {
				if (!firstExecution) {
					System.out.print(" - ");
				} else {
					firstExecution = false;
				}
				System.out.print(number);

			}

		}

	}
}
