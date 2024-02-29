package gaya;

import java.util.Locale;

public class swatch {
    public static void main(String args[]){
        String gender= "FEMALE";
         switch (gender.toLowerCase()){ /*coverting gender to lowercace*/
             case "female":
                 System.out.println("im a female");
                 break;

             case "male":
                 System.out.println("im a male");
                 break;

             case "prefer_not_to_say":
                 System.out.println("not prefer to say");
                 break;

             default:
                 System.out.println("unknown gender");



        }


    }
}
