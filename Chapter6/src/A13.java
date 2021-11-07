import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class A13 {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter Your DOB");
    System.out.println(LocalDate.now());
    String DOB=ab.next();
    LocalDate D=LocalDate.parse(DOB);
    LocalDate now=LocalDate.now();
    Period diff = Period.between(D, now);
    System.out.println("Age is ="+diff.getYears()+" "+diff.getMonths()+" "+diff.getDays());
	}

}
