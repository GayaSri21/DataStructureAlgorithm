package gaya;
import java.lang.String;
import java.util.Arrays;

public class enloo {
    public static void main(String args[]) {
        int [] numbers = {1, 2, 100, 99};
        String [] names = {"gaya", "arch", "abi"};
     //   System.out.println(numbers.length);
       Arrays.stream(numbers).forEach(System.out::println); /*shortest way to the floop */
        Arrays.stream(names).forEach(System.out::println);
     /* for (int i = 0; i < 4; i++) { // print from third index(3)
          System.out.println("numbers:"+numbers[i]); //it gives output from 13 to 100 (from the second index)

      }*/


       /* for (String name : names) {
            System.out.println(name);
        }*/
      /* for (int number : numbers) {

            System.out.println("number = " + number);
        }*/
      /*  for (int i = 0; i <= numbers.length; i++) {
            System.out.println("i = " + i);
        }*/
     /*   for (int i = numbers.length - 1; i >= 0; i--) {
            //type numbers.for - auto coding by intellij
            System.out.println("i = " + i);
        }*/
    }

}


