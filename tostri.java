package gaya;
public class tostri {
     static class naam {
         String name;
        public naam(String name) {
             this.name = name;
         }
        @Override
     public String toString() {
         return name;
     }
         }
         public static void main(String[] args) {
      naam obj1 = new naam("gaaya");
             System.out.println(obj1);  /* it needs toString so we need to call it*/

     }
}
