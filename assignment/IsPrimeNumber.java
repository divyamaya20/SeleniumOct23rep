package week2.day1.assignment;

public class IsPrimeNumber {
	
		public static void main(String[] args) {
		
		int n=73,factor=0;
		if(n>1) {
			for(int i=1;i<=n;i++) 
			{
				if(n%i==0) 
				{
					factor++;
				}
			}
			if(factor==2)
			{
				System.out.println(n + " is a prime number");
			}
			else{
				System.out.println(n + " is not a prime number");
				}				
				
			}
			
		else{
			System.out.println(n + " is not a prime number");
		    }		
		}	
}
		
	


