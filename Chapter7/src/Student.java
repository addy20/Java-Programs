import java.util.Scanner;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
	    System.out.println("Enter the no. of Students");
	    int n=ab.nextInt();
		String[] name = new String[n];
		int[] reg_no = new int[n];
		String[] sec =new String[n];
	     
	    for(int i=0; i<n; i++)  
	    {  
	    	System.out.println("Enter the Name Of the Student"); 
	    	name[i]=ab.next();
	    	System.out.println("Enter the registration no");
	    	reg_no[i]=ab.nextInt();
	    	System.out.println("Enter the Section");
	    	sec[i]=ab.next();
	    	
	    }  
	    System.out.println("Student Details : ");  
	    for (int i=0; i<n; i++)   
	    {  
	    System.out.println("Name: "+name[i]);
	    System.out.println("Registration_NO: "+reg_no[i]);
	    System.out.println("Section: "+sec[i]);
	    }  
	}

}
