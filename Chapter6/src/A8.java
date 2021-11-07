import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class A8 {
   public static void main(String[] args)
    {
       //Scanner ab=new Scanner(System.in);
       //System.out.println("Enter the Year");
	   //int year=ab.nextInt();
       //if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
         //      System.out.println("Year " + year + " is a leap year");
       //else
         //      System.out.println("Year " + year + " is not a leap year");
       

       //Alternate_Method
	//   Scanner ab=new Scanner(System.in);
	  // System.out.println("Enter the year");
	   //String Date=ab.next();
	  // LocalDate D=LocalDate.parse(Date);
	   //
         //   if(D.isLeapYear())
           // { 
             // System.out.println("year is Leap year"); 
            //}
            //else 
            //{ 
             // System.out.println("year is not a Leap year"); 
             //}
           //}
	   Scanner ab=new Scanner(System.in);
	   System.out.println("Enter the Year");
	   int year=ab.nextInt();
	   Year Y=Year.of(year);
	   if(Y.isLeap())
	   {System.out.println("Is LeapYear");}
	   else
		   System.out.println("Is not a leap year");
       
    
}}