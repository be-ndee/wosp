package methodenSpecial;

import java.util.Scanner;

public class Fibonacci {
	static double eing=0;
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while (eing<1)
		{
		System.out.println("Zahlen unter 1 sind nicht erlaubt");
		System.out.println("Bitte Zahl eingeben:");
		eing =scan.nextDouble();
		}
		
		for (int i=1; i<=eing; i++)
		{
			System.out.println(Fibonacci.fibo(i));
		
		}
	}
	
	static double fibo(double n)
	
	{
		
		if (n==1)
		{
			return 1;
			
		}
		else if(n==2)
		{
			return 1;
		}
		else
		{
						
			return (fibo(n-2)+fibo(n-1));
		}
	}

}
