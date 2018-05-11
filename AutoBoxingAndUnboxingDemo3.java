package langpackage;

public class AutoBoxingAndUnboxingDemo3 {
	public static void methodOne(Integer i) {
		System.out.println("Autoboxing");
	}

	public static void methodOne(int... i) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		int x = 10;
		methodOne(x);// Autoboxing

	}

}
// Autoboxing dominates var-arg method.
