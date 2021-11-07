import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.*;

public class A1 {
	public static void main(String[] args) {
		//current time in NY
		LocalTime time=LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(time);
    
        //Current full Date and Time
        LocalDateTime TD=LocalDateTime.now();
        System.out.println(TD);
        
        //lastDayOfcurrentMonth
        LocalDate date=LocalDate.now();
        System.out.println("Last Day of Current month "+date.with(TemporalAdjusters.lastDayOfMonth()));
	}

}
