import java.util.*;
class Pair<X,Y>{
	X x;
	Y y;
	public Pair(X x,Y y)
	{
		this.x=x;
		this.y=y;
	}
	public void getDescription() {
		System.out.println(x+" "+y);
	}
	
}
public class StringReverse {

	public static void main(String[] args) {
     String word="This is java i love java   bh ";
     String []arr=word.split("\\s");
     for(int i=arr.length-1;i>=0;i--)
     {
    	 if(arr[i].length()>0)
    	 System.out.print(arr[i]+" ");
     }
     Pair<Integer,String> p1=new Pair(5,"Aditya");
     p1.getDescription();
	}

}
