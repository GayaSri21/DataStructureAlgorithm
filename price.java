package gaya;

public class price extends wei{

    double pri;


    price(){
        super();
        this.pri=3;
    }

    price(price other){
        super(other);
        pri=other.pri;
    }

    public price(double w, double l, double h, double weight, double price) {
        super(w, l, h, weight,price);
        this.pri=price;

    }
    public price(double side,double dia,double weight){  //introducig new variable pree
        super(side,dia,weight);
        this.pri=dia;


    }
    public price(double price, double pri) {
        super(price);
        this.pri = pri;
    }
}
