package two;

public class main {

	public static void main(String[] args) {

		System.out.println(Add(4, 7, false));
		System.out.println(Check(1, 0));

		Loop();
		Arrays.CheckArray();
		ArrayPrint.PrintArray();
		Forloop.Insert();
	}

	public static int Add(int a, int b, boolean c) {

		if (c == true) {
			return a + b;
		} else {

			return a * b;
		}

	}

	public static int Check(int d, int e) {

		if (d == 0) {

			return e;
		}

		else if (e == 0) {

			return d;
		}
		return d + e;

	}

	public static void Loop() {

		for (int i = 0; i <= 10; i++) {
			int output = Check(i, 2);
			System.out.println(output);

		}
	}

}