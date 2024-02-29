package gaya;

public class wei extends inheri{

    double weight;

    public wei(double w, double l, double h, double weight) {
        super(w, l, h); //is super is not here then it copies inherit() constructor on 1st
        //super class has no idea about sub class
        // super used to intialize parent class constructor except calss declared as private // copy from above class(parent)
        this.weight = weight;// we can use l above coz it's from inheri constructor not class
        //super(l,w,h);// this one is error coz it shouldn't be below
        System.out.println(super.weight); //super helps to copy weight from parent class inheri
    }

    public wei(double w)     ///
    {
        super(w);
        this.weight=3;
    }

    wei(wei othjkk)                                    //////same process    ////othjkk-object variable

    {
        super(othjkk);
        weight=othjkk.weight;
    }

    wei(double side, double weight){
        super(side);
        this.weight=weight;

    }
    /*static void greeting(){
        System.out.println("Hey Buddy, I'm in 'wei' ");
    }*/



    public wei(double side, double price, double weight) {
        super(side);
        this.weight=weight;
    }

    public wei() {
        super();
    }

    public wei(double w, double l, double h, double weight, double price) {
        super(w,l,h);
        this.w=weight;

    }
}

