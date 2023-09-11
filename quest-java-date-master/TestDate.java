import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.YEAR,year);
        Date date=calendar.getTime();
        int dayOfWeek=(calendar.get(Calendar.DAY_OF_WEEK));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

        System.out.println("The date is: " + simpleDateFormat.format(date));
        System.out.println("The day of week is : " +dayOfWeek);

    }
}