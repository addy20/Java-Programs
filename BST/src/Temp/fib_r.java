package Temp;

public class fib_r {

	public static void main(String[] args) {

		
		long in=System.nanoTime();
		System.out.println("in time: "+System.nanoTime());
		System.out.println("8th fibonacci term is: "+fib_rec(8));
		long out=System.nanoTime();
		System.out.println("out time: "+System.nanoTime());
		
		System.out.println("Total elapsed time is = "+(out-in));

	}
	
	public static long fib_rec(int n) {
		if(n==0||n==1) {
			return n;
		}
		System.out.println("For n = "+n+" time = "+System.nanoTime());
		return fib_rec(n-1)+fib_rec(n-2);
		
	}

}
