import java.time.LocalDate;
import java.util.*;
public class Comparing_Two_Dates {
	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter two dates");
    String d1=ab.next();
    String d2=ab.next();
    LocalDate date1=LocalDate.parse(d1);
    LocalDate date2=LocalDate.parse(d2);
    if(date1.compareTo(date2) > 0) {
        System.out.println("Date 1 occurs after Date 2");
     } else if(date1.compareTo(date2) < 0) {
        System.out.println("Date 1 occurs before Date 2");
     } else if(date1.compareTo(date2) == 0) {
        System.out.println("Both dates are equal");
     }
	}

}
