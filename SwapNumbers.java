package basiclab1;

public class SwapNumbers {
	public static void main(String[] args) {
		int first = 120, second = 220;
		System.out.println("---before swap---");
		System.out.println("first number = " + first);
		System.out.println("second number = " + second);
		first = first - second;
		second = first + second;
		first = second - first;
		System.out.println("---after swap---");
		System.out.println("first number = " + first);
		System.out.println("second number = " + second);
	}

}
