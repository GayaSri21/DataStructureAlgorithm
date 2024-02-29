package gaya.ploymorphism;

public class consover {

    double sum(double a,double b){
        return a + b;
    }
    double sum(int a, int b,int c){
        return a + b +c;
    }
    double sum(double a,int b){
        return a + b;
    }

    public static void main(String[] args) {
        consover obj = new consover();
        obj.sum(5000,77);
        System.out.println(obj.sum(5,9));
        System.out.println(+obj.sum(600000,88,77));
    }
}
