import java.time.LocalDate;
import java.time.Period;

public class A7 {
	public static void main(String[] args) {
    LocalDate now=LocalDate.now();
    Period p=Period.ofDays(14);
    LocalDate then=now.plus(p);
    LocalDate date=LocalDate.of(2020, 12, 06);
    System.out.printf("Today Date is %s , Date after two weeks is %s", now,then);
    System.out.println();
    System.out.println(date.getDayOfWeek().toString());
	}

}