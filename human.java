package gaya.cloning;

public class human implements Cloneable  //cloneable telling the jvm to clone the object
{
    String name;
    int age;

    int[] arr;

    public human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 4, 5};


    }
   /* @Override  //its overiding the object
    public Object clone() throws CloneNotSupportedException {
        //this is shallow copy
        return super.clone();
    }*/

        //MAKE A DEEP COPY
        public Object clone () throws CloneNotSupportedException {
            human twin = (human)super.clone();

            twin.arr = new int[twin.arr.length];
            for (int i = 0; i < twin.arr.length; i++) {
                twin.arr[i] = this.arr[i];  //this is gaya current object
            }
            return twin;
        }
    }
