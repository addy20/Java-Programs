import java.time.*;
import java.time.temporal.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class A4 {
	public static void main(String[] args) {
    //LocalDate nowa=LocalDate.now();
    Scanner ab=new Scanner(System.in);
    String s=ab.next();
    DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate nowa=LocalDate.parse(s, df);
    System.out.println(" "+nowa.with(TemporalAdjusters.firstDayOfMonth()));
    System.out.println(" "+nowa.with(TemporalAdjusters.lastDayOfMonth()));
	}

}
