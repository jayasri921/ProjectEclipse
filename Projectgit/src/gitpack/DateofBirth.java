package gitpack;
import java.time.LocalDate;
import java.time.Period;
public class DateofBirth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.of(1998, 10, 28);
		LocalDate date1=LocalDate.now();
		Period period=Period.between(date, date1);
		System.out.println("Age of a person:"+period );
		System.out.println();
	}

}






































