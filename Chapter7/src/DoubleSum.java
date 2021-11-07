import java.util.ArrayList;

public class DoubleSum {

	public static void main(String[] args) {
		ArrayList <Double> arr=new ArrayList <Double> ();
	    arr.add(10.1);
	    arr.add(20.2);
	    arr.add(30.3);
	    arr.add(40.4);
	    arr.add(50.5);
	    double sum=0;
	    for(int i=0;i<arr.size();i++)
	    {
	        sum=sum+arr.get(i);
	    }
	    System.out.println(sum);
	}

}
