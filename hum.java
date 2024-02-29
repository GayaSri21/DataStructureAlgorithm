package gaya.pop;

public class hum {
    public static void main(String[] args) {
        popu gaya = new popu("gaya",23,5000,true);
        popu abijith = new popu("abi",37,10000,true);
        popu abi = new popu("abi",37,10000,true);
        System.out.println(popu.population); /*totally 3 people are presented above so output is 3*/
        System.out.println(popu.population);
        System.out.println(popu.population); /*without any error* and static doesn't need object(reference variable like abi gaya.*/

    }



}





