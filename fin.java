package gaya;

public class fin {
    public static void main(String[] args) {

    /*    rakh abi = new rakh("abi", 9);
        rakh gaya = new rakh("gaya", 35);
        System.out.println(abi.name);
        System.out.println(abi.b);
        //abi.name="abhi"; /*it's supposed to be work but with final before the data type it's not working*/ /*this is the way to change name but final stopping them*/
    //    System.out.println(abi.name);

        //  rakh abi=new rakh("hi",66);
        //  rakh gaya = new rakh("kk",99); /*can't the change the value in normal without final*/

        rakh d ;//= new rakh("jj",67);

        for(int i=0;i< 1000000;i++){ /*10L*/
            d = new rakh("hh",88);
      //      d.finalize(); we cant't do finalize()destroyer manually

        }
     //   System.out.println(d.name);



    }

    static class rakh {
        final String name;
        int b = 88;

        public rakh(String name, int b) {
            this.name = name;
            this.b = b;


        }
        
        

        @Override
        protected void finalize() throws Throwable {
            System.out.println("destroyed");

        }
    }
}





