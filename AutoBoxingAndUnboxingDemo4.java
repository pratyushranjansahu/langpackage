package langpackage;

public class AutoBoxingAndUnboxingDemo4 {
	public static void methodOne(Long l) {
		System.out.println("Long");
	}

	public static void main(String[] args) {
		int x = 10;
		methodOne(x);// Compile Time Error : The method methodOne(Long) in the
						// type AutoBoxingAndUnboxingDemo4 is not applicable for
						// the arguments (int)
	}

}
/*
 * Widening followed by Autoboxing is not allowed in java but Autoboxing
 * followed by widening is allowed.
 */
