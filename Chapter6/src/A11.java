import java.util.*;
import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class A11 {

	public static void main(String[] args) {
	  Scanner ab=new Scanner(System.in);
	  System.out.println("enter the year");
	  int year=ab.nextInt();
     
	  Year y = Year.of(year);
     System.out.println("Current Year: " +y);  
     boolean isLeap = y.isLeap(); 
     System.out.println("Leap Year = "+isLeap);  
     int length = y.length();
     System.out.println("Length of the year:" +length+" days"); 
	}
}