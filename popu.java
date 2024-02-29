package gaya.pop;

public class popu {


    String name;
    int age;
    long salary;

    static long population;

    boolean married;


    public popu(String name, int age, long salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        popu.population+=1;
    }
}


