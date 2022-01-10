package Temp;

public class partitionProblem {

	public static void main(String[] args) {
		int s[]= {1,2,3,4,5,6,7,8,9,0};
		int n=9,k=4;
		partition(s, n, k);

	}
	public static void partition(int s[], int n, int k)
	{
			int m[][]=new int[n+1][k+1]; 
			int d[][]=new int[n+1][k+1]; 
			int p[]=new int[n+1]; 
			int cost; 
			int i,j,x; 
			p[0] = 0; 
			for (i=1; i<=n; i++) p[i]=p[i-1]+s[i];
			for (i=1; i<=n; i++) m[i][1] = p[i]; /* initialize boundaries */
			for (j=1; j<=k; j++) m[1][j] = s[1];
			for (i=2; i<=n; i++) 
			{
				for (j=2; j<=k; j++) 
				{
					m[i][j] = Integer.MAX_VALUE;
					for (x=1; x<=(i-1); x++) 
					{
						cost = Math.max(m[x][j-1], p[i]-p[x]);
						if (m[i][j] > cost) 
						{
							m[i][j] = cost;
							d[i][j] = x;
				        }
				    }
				}
			}
			
			reconstruct_partition(s,d,n,k); /* print book partition */
	}
	
	
	static void reconstruct_partition(int s[],int d[][], int n, int k)
	{
		if (k==1)
		print_books(s,1,n);
		else {
		reconstruct_partition(s,d,d[n][k],k-1);
		print_books(s,d[n][k]+1,n);
		}
	}
	static void print_books(int s[], int start, int end)
	{
		int i; /* counter */
		for (i=start; i<=end; i++)
			System.out.print(s[i]+" ");
		System.out.println();
	}
	

}
