package gaya;

public class statics {
         static int  a = 5;
         static int b=8;

         static {
             System.out.println("this is staticsblock");
             b= a * 5 ;
         }

    public static void main(String[] args) {

          statics obj = new statics();
        System.out.println(statics.a + " " +statics.b);

           statics.a += 5 ;

        statics obj2 =  new statics();
        System.out.println(statics.a + " " +statics.b);


    }
}


