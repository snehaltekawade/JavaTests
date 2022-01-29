package practices;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		int n;
		int fact_var=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		//for (int i=1;i<=n;i++) {
			//fact_var=fact_var*i;
		//}
	int i=1;
	while (i<=n) {
		fact_var= fact_var*i;
		i++;
	}
		System.out.println("Factorial of given number "+n+" is:"+fact_var);
		

	}

}
