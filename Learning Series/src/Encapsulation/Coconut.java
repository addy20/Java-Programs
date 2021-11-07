package Encapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coconut {

	public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(br.readLine());
    while(T-->0)
    {
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	long D=Long.parseLong(st.nextToken());
    	long d=Long.parseLong(st.nextToken());
    	long p=Long.parseLong(st.nextToken());
    	long q=Long.parseLong(st.nextToken());
    	long n = D/d;
        long ans=0;
        ans = n*p*d + q*d*(n*(n-1))/2 + (D%d)*(p+n*q);
        System.out.println(ans);
    }
	}

}
