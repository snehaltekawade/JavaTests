package practices;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		int num1, num2 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 =sc.nextInt();
		System.out.println("Enter second number:");
		num2 =sc.nextInt();
		System.out.println("Arithmetic perations of these tw numbers are:");
		System.out.println("Addition of the numbers is:"+(num1+num2));
		System.out.println("Subtraction of the numbers is:"+(num1-num2));
		System.out.println("Multiplication of the numbers is:"+(num1*num2));
		System.out.println("Division of the numbers is:"+(num1/num2));




	}

}
