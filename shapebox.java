package gaya;



public class   shapebox {
    public static void main(String[] args) {


        inheri sha1 = new inheri(77);
        inheri sha2 = new inheri();

        inheri sha3 = new inheri(55, 55, 00);

      /*  wei sha4 = new wei(99);*/
        wei sha5 = new wei(99,88,66,88);
        inheri sha6 = new wei(33,76,55,77);            ///////same process
         /* wei sha7 = new inheri(99,55,77); */ //error coz it's child to parent
        price sha8=new price(55,66,99);
        inheri sha9 = new price(77,999,1000);
        inheri sha10=new inheri();
        inheri sha11=new wei();
        inheri sha12=new wei(33,44,66,88,88);
        sha11.greeting();
        wei.greeting();  //you can inherit but you cannot override

        sha10.greeting();
         //wei.greeting();





        System.out.println(sha1.h +  " " +sha1.w);
        System.out.println(sha2.h + " " +sha2.w+ " " ); //we cant use l here coz it is private
        System.out.println(sha3.h +  " " +sha3.w);

       /* System.out.println(sha6.w + " " +sha6.h+ " " +sha6.weight);*/ //error coz of sha6.weight coz it's parent to child

    }
}
