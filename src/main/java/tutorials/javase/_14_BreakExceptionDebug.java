package tutorials.javase;

import java.rmi.ConnectException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


//break-return-continue
//exception handling
//debug

//access modifier
//metot

public class _14_BreakExceptionDebug {

    public static void main(String[] args) throws ConnectException, HamitMizrakException {

        // Java Lang
        // Object
        // Throwable
        // Errors - Exception
        // Errors: Syntax inx, Compiler Error, Runtime Error, ,logical Error
        // Exception
        System.out.println("ilk durum");

        //try catch finally throw throws
        try {
            int x = 4 / 0;
        } catch (ArithmeticException ai) {
            System.out.println("Aritmetik istisna: " + ai);
        } catch (Exception e) {
            System.out.println("Genel istisna: " + e);
        } finally {
            System.out.println("db.close()");
        }
        System.out.println("son durum");
        //throw  new ConnectException("ooppss Failed Connection");

        int number=-44;
        if(number>0){
            System.out.println("devam et");
        }else{
            //throw  new ConnectException("negatif bir yapı var bunu çözmelisin.");
            throw  new HamitMizrakException("negatif bir yapı var bunu çözmelisin.");
        }

    }
}
