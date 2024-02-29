package gaya;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class dait {
    public static void main(String args[]){
        java.sql.Date datesql = new java.sql.Date(1);
        Date date=new Date();
        String S = new String("gayaabi");
        LocalDate localDate= LocalDate.now();
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(S);
        System.out.println(date);
        System.out.println(datesql);

    }
}
