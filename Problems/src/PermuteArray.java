import java.util.*;
public class PermuteArray {

	public static void main(String[] args) {
    List<Character> A=new ArrayList<Character>();
    List<Integer> P=new ArrayList<Integer>();
    Collections.addAll(A, 'a','b','c','d');
    Collections.addAll(P, 3, 1, 2, 0);
    System.out.println(Perm(P,A));
    Perm1(P,A);
	}
	public static List<Character> Perm(List<Integer>P, List<Character>A){
		int n=A.size();
		ArrayList<Character> B=new ArrayList<Character>(Collections.nCopies(n, null));
		for(int i=0;i<n;i++)
		{
			B.set(P.get(i), A.get(i));
		}
		return B;
	}
	public static void Perm1(List<Integer>P, List<Character>A) {
		int n=A.size();
		for(int i=0;i<n;i++)
		{
			int next=i;
			while(P.get(next)>=0)
			{
				Collections.swap(A, i, P.get(next));
				int temp=P.get(next);
				P.set(next, P.get(next)-n);
				next=temp;
			}
		}
		for(int i=0;i<P.size();i++)
		{
			P.set(i, P.get(i)+P.size());
		}
		System.out.println(A);
		System.out.println(P);
	}
	

}
