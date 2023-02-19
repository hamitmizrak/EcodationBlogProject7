package tutorials.javase;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


//break-return-continue
//exception handling
//debug

//access modifier
//metot

public class _13_DateCalendarLocalDate {

    public static void main(String[] args) {
        //Date: 1900 , 1Ocak 1970

        //DATE
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDay()); //pazar=0 pazartesi:1 .. cumartesi:6 ,aylar: sıfırdan başlar saymaya
        System.out.println(date.getDate());
        System.out.println(date.getYear() + 1900);
        System.out.println(date.getMonth());//aylar: sıfırdan başlar saymaya
        date.setMonth(10);
        System.out.println(date.getMonth());
        System.out.println(date.getHours()+":"+date.getMinutes());
        System.out.println(new Date(System.currentTimeMillis()) ); // yıl ay gün saat dakika sanite zone
        long time=System.currentTimeMillis();
        System.out.println(time);

        //Calendar:
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTime().getYear()+1900);

        //LocalDate
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
    }
}
