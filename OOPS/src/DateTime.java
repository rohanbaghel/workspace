import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalTime time= LocalTime.now();
		System.out.println(time);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter formate= DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		System.out.println(formate);
		
		String formatted= now.format(formate);
		System.out.println(formatted);
	}

}
