import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
    String[] strings= {"painful","mainly","gaining","raindrops"};
    Arrays.sort(strings);
    for(int i=0;i<strings.length;i++)
    {
    	System.out.println(strings[i]);
    }
	}

}
