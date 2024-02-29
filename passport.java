package gaya;



import java.time.LocalDate;

public class passport {
    public static void main(String args[]) {
        data data1 = new data
                ("1234", "India", LocalDate.of(2027, 9, 21));
        data data2 = new data
                ("5678", "United States of America", LocalDate.of(2028, 8, 17));


        System.out.println("<India>");
        System.out.println(data1.number);
        System.out.println(data1.country);
        System.out.println(data1.expirydate);
        System.out.println();

        System.out.println("<United States America>");
        System.out.println(data2.number);
        System.out.println(data2.country);
        System.out.println(data2.expirydate);

    }
        static class data {
            String number;
            String country;
            LocalDate expirydate;

            data(String number, String country, LocalDate expirydate) {
                this.number = number;
                this.country = country;
                this.expirydate = expirydate;

            }
        }
    }

