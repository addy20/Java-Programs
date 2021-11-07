import java.util.*;
public class Increasing_Size_OF_ARRAY {

	public static void main(String[] args) {
    int []myArr= {2,4,5,6,8,9,9};
    System.out.println("Array size before copy :"+myArr.length);
    int []newArr=Arrays.copyOf(myArr, 10);
    for(int i=0;i<newArr.length;i++)
    {
    	System.out.println("New Array after copying :"+newArr[i]);
    }
	}

}
