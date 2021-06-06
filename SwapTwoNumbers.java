package basiclab1;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first = 120, second = 220;
		System.out.println("----Before swap-----");
		System.out.println("first number = " + first);
		System.out.println("Second number = " + second);
		int2 temporary = first;
		first = second;
		second = temporary;
		System.out.println("---after swap----");
		System.out.println("first number = " + first);
		System.out.println("Second number = " + second);
	}

}
