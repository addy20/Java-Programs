import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class WEEK_NO_ {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter the Date with month and year");
    DateTimeFormatter nTZ=DateTimeFormatter.ofPattern("a");
   // String D=ab.next();
    LocalDateTime date1=LocalDateTime.parse("2020-12-30T12:33:56");
    System.out.println("Output "+nTZ.format(date1));
    
	}

}
