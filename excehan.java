package gaya.excepthand;
import java.lang.Throwable;

public class excehan {


    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            int c = a / b;
            ///     divide(a, b);

            //    throw new Exception("bad words");


          /*  String name="gaya";
            if(name.equals("gaya")){
                throw new MyException("name is Gaya ");  //this is 'super(message)' in MyException
            }
        }*/
        }
        //   catch(MyException e){
          //  System.out.println(e.getMessage());
      //  }
       catch(ArithmeticException e){
            System.out.println(e.getMessage());
            }
       }
      /*  catch (/*Arithmetic/* Exception e) {    //you dont have to add the word arithmetic coz you mentioned it below
           System.out.println("its normal exception");
        }
        finally {
            System.out.println("it run always");
        }
    }*/
            static int divide ( int a, int b) throws ArithmeticException {
                if (b == 0) {
                    throw new ArithmeticException("don't divide by zero");
                }
                return a / b;


            }
        }


