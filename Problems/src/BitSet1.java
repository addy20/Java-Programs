import java.util.*;
public class BitSet1 {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int N=ab.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=ab.nextInt();
		}
		ArrayList <Integer> L=new ArrayList<Integer>();
		for(int i:arr)
		{
			L.add(i);
		}
        int A=ab.nextInt();
        int B=ab.nextInt();
        Arrays.sort(arr);
        int count=0;
        
        for(int i=0;i<N-1;i++)
        {    
        	Collections.sort(L);
        	L.set(i, L.get(i)-B);
        	count++;  	
	}
        L.set(N-1, L.get(N-1)-A);
        
        System.out.println(count);
        
	
}}
