import java.time.temporal.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class A6 {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter a date with month and year");
    String str=ab.next();
    DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate date=LocalDate.parse(str,df);
    System.out.println(date.getDayOfWeek());
    
	}
}
