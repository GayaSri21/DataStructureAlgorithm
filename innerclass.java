package gaya;

public class innerclass {
    static class inclass {
        String name;

        inclass(String name) {  /*constructor in public so we can use it on nxt set of code*/


            this.name = name;
        }
    }

    public static void main(String[] args) {
        inclass obj1 = new inclass("gaya");
        inclass obj2 = new inclass("abi");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}





