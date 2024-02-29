package gaya.ploymorphism;

public class numtostri {
    int num;

    @Override
    public String toString() {
        return "numtostri{" +
                "num=" + num +
                '}';
    }

    public numtostri(int num){
        this.num=num;

    }

    public static void main(String[] args) {
        numtostri obj = new numtostri(44);
        System.out.println(obj);
    }
}
