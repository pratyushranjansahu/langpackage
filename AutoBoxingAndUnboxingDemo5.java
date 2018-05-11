package langpackage;

public class AutoBoxingAndUnboxingDemo5 {
	public static void methodOne(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		int x = 10;
		methodOne(x);// Object

	}

}
/*
 * Widening followed by Autoboxing is not allowed in java but Autoboxing
 * followed by widening is allowed.
 */
