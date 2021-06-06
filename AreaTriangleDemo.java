package basiclab1;
import java.util.Scanner;
public class AreaTriangleDemo {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter the width of triangle");
double base=scanner.nextDouble();
System.out.println("enter the height of triangle");
double height=scanner.nextDouble();
double area=(base*height)/2;
System.out.println("area of triangle is:"+area);
}
}
