package practices;
import java.util.Scanner;

public class Calculator {
	
	public int addition(int num1,int num2)
	{
		return num1+num2;
	}
	public int subtraction(int num1,int num2)
	{
		return num1-num2;
	}
	public int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
	public int division(int num1,int num2)
	{
		return num1/num2;
	}
	public int modulo(int num1,int num2)
	{
		return num1%num2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter First number:");
			int num1=sc.nextInt();
			System.out.println("Enter Second number:");
			int num2=sc.nextInt();
			System.out.println("Which operation will you perform(1/2/3/4/5:");
			System.out.println("1.Addition of given numbers is:");
			System.out.println("2.Subtraction of given numbers is:");
			System.out.println("3.Multiplication of given numbers is:");
			System.out.println("4.Division of given numbers is:");
			System.out.println("5.Modulo of given numbers is:");
			int op=sc.nextInt();
			Calculator cal=new Calculator();
			if(op==1)
			{
				System.out.println("Addition is:"+cal.addition(num1, num2));
			}
			else if(op==2)
			{
				System.out.println("Subtraction is:"+cal.subtraction(num1, num2));
			}
			else if(op==3)
			{
				System.out.println("Multiplication is:"+cal.multiplication(num1, num2));
			}
			else if(op==4)
			{
				System.out.println("Division is:"+cal.division(num1, num2));
			}
			else if(op==5)
			{
				System.out.println("Modulo is:"+cal.modulo(num1, num2));
			}
			else
			{
				System.out.println("Invalid Input");
			}
			{
				break;
			}

		}
 
	}

}
