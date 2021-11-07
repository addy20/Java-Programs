package Encapsulation;

public class Recursion {

	public static void main(String[] args) {
		int a=4;
		int b=4;
//		System.out.println("Sum of first n natural number: "+power1(a,b));
        System.out.println(path(a,b));
	}
	public static int power(int a,int b) {
		if(b==0) {
			return 1;
		}else {
			return a*power(a,b-1);
		}	
	}
	public static int power1(int a,int b) {
		if(b==0) {
			return 1;
		}else if(b%2!=0) {
			return a*power1(a,b-1);
		}else {
			return power1(a*a,b/2);
		}
	}
	public static int path(int m,int n) {
		if(m==1||n==1) {
			return 1;
		}else {
			return path(m,n-1)+path(m-1,n);
		}
	}

}
