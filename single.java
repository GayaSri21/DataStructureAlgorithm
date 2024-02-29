package gaya;

public class single {
    public static void main(String[] args) {


        singleton obj1 = singleton.getInstance();

        singleton obj2 = singleton.getInstance();

        singleton obj3 = singleton.getInstance();

        ///all 3 ref variable are pointing single object(instance variable)


    }
}
