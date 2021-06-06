package basiclab1;
import java.util.Scanner;
public class SqaureAreaDemo {
public static void main(String[] args) {
	System.out.println("enter side of sqaure");
	Scanner scanner=new Scanner(System.in);
	double side=scanner.nextDouble();
	double area=side*side;
	System.out.println("Area of sqaure:"+area);
}
}
