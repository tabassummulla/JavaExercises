package two;

public class Forloop {

	public static void Insert() {

		int numbers[] = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;

			System.out.println(numbers[i]);
		}

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 10;
			System.out.println(numbers[i]);
		}
	}
}
