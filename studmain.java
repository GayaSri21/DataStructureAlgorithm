package gaya.GEN;

//import static java.lang.System.*;

import java.util.Arrays;
import java.util.Comparator;

public class studmain{
    public static void main(String[] args) {
        stud abi=new stud(1,88.9f);
        stud gaya=new stud(2,99.9f);
        stud arch=new stud(3,78.9f);
        stud meera=new stud(4,90.9f);
        stud nat=new stud(5,77.9f);
        stud[] list={abi,gaya,arch,meera,nat};
    //    System.out.println(Arrays.toString(list));
      /// Arrays.sort(list, new Comparator<stud>() {
       //    @Override
        //    public int compare(stud o1, stud o2) {
         //      return -(int)(o1.marks-o2.marks); //- before int is descending order
      //    }
    //   });
        Arrays.sort(list, (o1, o2) -> - (int)(o2.marks-o1.marks));
        System.out.println(Arrays.toString(list));
    //    System.out.println(list);

        if(meera.compareTo(gaya)<0){
         System.out.println("gaya has more marks");
       }



    }

    }

