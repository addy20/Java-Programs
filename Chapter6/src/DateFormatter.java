import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
    DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println(df.format(LocalDate.now()));
    System.out.println(LocalDate.parse("02/04/2018", df));
   
    DateTimeFormatter nTZ=DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
    System.out.println(nTZ.format(ZonedDateTime.now()));
	}

}
