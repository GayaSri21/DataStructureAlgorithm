package gaya.GEN;

import java.util.Arrays;
import java.util.List;
//T  should either be Number or number's subclasses
public class wild <T extends Number>{   //number is class
    private Object[] data;  //internal implementation of array taking object
    private static int DEFAULT_SIZE = 10;
    private int size = 0;   //it cant't be array.

    public wild(){
        data = new Object[DEFAULT_SIZE];
    }
    /*public void getList(List<? extends Number> list) {  // we can pass subclass of number like float int etc.
        //do something
    }*/

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the current items in the new array
        for (int i = 0;i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
  /* public T remove(){
        T removed=((T)data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index]=value;
    } */

    @Override
    public String toString() {
        return "lis{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        lis list = new lis();
        //  list.add(5);
        //   list.add(9);
        //   list.add(7);
        System.out.println(list);   //it needs toString to run.

        lis<Number> list2=new lis<>();
        for(int i=0;i<14;i++){
            list2.add(2*i);
        }
        System.out.println(list2);


        //for (int i = 0; i < 14; i++) {
        //list.add(2 * i);
        //  }
        //  System.out.println(list);
        //  ArrayList<Integer> list1 = new ArrayList<>();
        //   list1.add(8);
        //    System.out.println(list1);



    }
}


