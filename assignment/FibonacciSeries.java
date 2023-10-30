package week2.day1.assignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n1=0,n2=1,sum=0;
		System.out.println("Fibonacci series");
		System.out.print(n1 + "  " + n2);
		for (int i = 0; i <=5; i++) {
			sum=n1+n2;
			System.out.print("  "+ sum + " ");
			n1=n2;
			n2=sum;
			
		}
	}

}