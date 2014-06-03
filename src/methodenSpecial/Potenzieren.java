package methodenSpecial;

public class Potenzieren {
	
	public static void main(String[] args) {
	
	System.out.println(Potenzieren.xhochn(2, 0));
		
	}
	
 static double xhochn(double x, double n)
{
	 if(n==0)
	 {
		 return 1;
	 }
	 else
	 {
		 return xhochn(x, n-1) * x; 
	 }
	 
	 
	
	
}

}
