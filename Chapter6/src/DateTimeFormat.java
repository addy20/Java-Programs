import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {

	public static void main(String[] args) {
    String armisticeDate="1914-11-11";
    LocalDate aLD=LocalDate.parse(armisticeDate);
    System.out.println("Date: "+aLD);
    
    String armisticeDateTime="1914-11-11T11:11";
    LocalDateTime aLDT=LocalDateTime.parse(armisticeDateTime);
    System.out.println("Date/Time: "+aLDT);
    
    DateTimeFormatter dfp=DateTimeFormatter.ofPattern("dd MMM uuuu");
    String anotherDate="27 Jan 2011";
    LocalDate random=LocalDate.parse(anotherDate, dfp);
    System.out.println(anotherDate +" parses as "+random);
    System.out.println(aLD+" formats as "+dfp.format(aLD));
	}

}
