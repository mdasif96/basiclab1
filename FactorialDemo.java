package basiclab1;
import java.util.Scanner;
public class FactorialDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		int factorial=fact(num);
		System.out.println("factorail of entered number is: "+factorial);
		}
	static int fact(int n)
	{
		int output;
		if(n==1) {
			return 1;
		}
		output=fact(n-1)*n;
		return output;
	}

}
