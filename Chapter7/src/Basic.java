import java.util.*;
public class Basic {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    int[] array = new int[10];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<10; i++)  
    {  
    array[i]=ab.nextInt();  
    }  
    System.out.println("Array elements are: ");  
    for (int i=0; i<10; i++)   
    {  
    System.out.print(array[i]+" ");  
    }  
   }  
 }  


