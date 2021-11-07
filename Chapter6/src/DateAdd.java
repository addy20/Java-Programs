import java.time.LocalDate;
import java.time.Period;

public class DateAdd {
	public static void main(String[] args) {
    LocalDate now=LocalDate.now();
    Period p=Period.ofDays(700);
    LocalDate then=now.plus(p);
    System.out.printf("Seven hundred days from %s is %s", now,then);
	}

}
