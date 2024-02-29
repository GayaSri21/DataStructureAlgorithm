package gaya;
 public class  singleton {
  //  private singleton() {
 //   }
    private static singleton ins; /*creating instance*/
    public static singleton getInstance() {          /*giving you instance*/
        if (ins == null) {
            ins=new singleton(); /*object1(obj1) in single program saved in ins. */

        }
             return ins;
        }


    }



