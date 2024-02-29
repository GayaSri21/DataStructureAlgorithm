package gaya;

public class inheri {

    double w;

    double weight;
    private double l;
    double h;

    double size;

    inheri() {                          ////type of polymophism cause definition is different in every below code in the same name of iheri.
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    static void greeting(){
        System.out.println("Hi Buddy");
    }
    inheri ( double side){ //triangle                                //introducing new variable side
     /*   this.side=side; */  /* wrong one   */

       this.h=side;
            this.w=side;
            this.l=side;
    }
    inheri(double w, double l, double h) {
        this.w = w;
        this.l = l;
        this.h = h;
    }

    inheri(inheri old) {                                /////same process
        this.h = old.h;
        this.l= old.l;

    }
}

