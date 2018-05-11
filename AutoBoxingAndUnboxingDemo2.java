package langpackage;

public class AutoBoxingAndUnboxingDemo2 {
	public static void methodOne(long l) {
		System.out.println("widening");
	}

	public static void methodOne(int... i) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		int x = 10;
		methodOne(x);//widening

	}

}
//Widening dominates var-arg method.
