package gaya.collection;

import java.util.*;

public class collect {
    public static void main(String[] args) {


        List<Integer> gaya = new ArrayList<>(); //      reference variable (List is parent)=object of chid
        List<Integer> list2 = new LinkedList<>();
        list2.add(22);
        list2.add(14);
        list2.add(33);
        System.out.println(list2);

        List<Integer> vector=new Vector<>();

        vector.add(88);
        vector.add(89);

        System.out.println(vector);

    }
}
