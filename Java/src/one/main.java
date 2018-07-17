package one;

public class main {

	public static void main(String[] args) {

		// one

		System.out.println("Hello World!");

		String variable = "Hello World!";
		System.out.println(variable);

		System.out.println(Parameter("My name is Tabassum"));

		System.out.println(HelloWorld("Hello World"));

		System.out.println(Add(8, 3));

	}

	public static String Parameter(String a) {

		return a;
	}

	public static String HelloWorld(String b) {

		return b;
	}

	public static int Add(int t, int m) {
		return t + m;

	}

}