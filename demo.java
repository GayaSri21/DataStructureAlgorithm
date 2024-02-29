package gaya;

public class demo {
  //  private static final Object inheri = 8 ;
      int num;

  public demo(int num) {
        this.num = num;
    }

   /* public demo() {

    }

    @Override
    public boolean equals(Object obj) {

        return this.num==((demo)obj).num;
    }


    @Override
   public int hashCode() {

        return super.hashCode();
    }*/


    public static void main(String[] args) {
        demo obj = new demo(100);
        demo obj1=new demo(100);
        System.out.println(obj.hashCode());
        System.out.println(obj instanceof demo);
        if(obj==obj1){
            System.out.println("t");

        }
        if(obj.equals(obj1)){
            System.out.println("true");
        }

        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().getClassLoader());



    }



}
