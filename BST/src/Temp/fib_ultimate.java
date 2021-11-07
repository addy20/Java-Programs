package Temp;

public class fib_ultimate {

	public static void main(String[] args) {
		int n=8;
		System.out.println("Fib of "+n+" is= "+fib_ult(n));

	}
	public static long fib_ult(int n) {
		long a=0,b=1,c;
		if(n==0) {
			return a;
		}
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}

}
