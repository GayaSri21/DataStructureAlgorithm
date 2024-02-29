package gaya;

public class modi {
    private int num;
    public String name;
    int[] arr ;

    public int getNum() {      //this is getter we can use it in other class even if its in private

        return num;
    }

    public modi(int num, String name){
        this.num=num;
        this.name = name;
        this.arr=new int[num];


    }
}
