package Temp;

import java.util.*;

public class userStops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int max=Integer.MIN_VALUE;
		int ch;
		do {
			
			a=sc.nextInt();
			if(a>max) {
				max=a;
			}
			System.out.println("Wish to continue?");
			ch=sc.nextInt();
			
		}while(ch!=0);
		
		System.out.println(max);

	}

}
