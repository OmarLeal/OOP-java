import java.time.*;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate myLocalDate = LocalDate.now();
        LocalTime myLocalTime = LocalTime.now();
        LocalDateTime myLocalDateTime = LocalDateTime.now();
        DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println(myLocalDate);
        System.out.println(myLocalTime);
        System.out.println(myLocalDateTime);

        //Needs to be formatted.
        String formattedDate = myLocalDateTime.format(myDateTimeFormatter);
        System.out.println(formattedDate);
    }    
}

/*
 * yyyy-MM-dd	"1988-09-29"	
   dd/MM/yyyy	"29/09/1988"	
  dd-MMM-yyyy	"29-Sep-1988"	
  E, MMM dd yyyy	"Thu, Sep 29 1988"
 */