import java.time.LocalDate;
import java.time.Period;

public class DateTodayTommorow {
	public static void main(String[] args) {
    LocalDate now=LocalDate.now();
    //Period p=Period.ofDays(1);
    //LocalDate tomorrow=now.plusDays(1);
    //LocalDate yesterday=now.minusDays(1);
    // System.out.printf("Today's Date is %s Yesterday date was %s Tommorow date is %s", now,yesterday,tomorrow);
    LocalDate after=now.plusDays(10);
    LocalDate before=now.minusDays(10);
    System.out.printf("10days Before Date was :%s 10days after Date will be:%s",before,after);
    
	}

}
