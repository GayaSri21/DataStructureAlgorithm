package gaya.GEN;

public class stud implements Comparable<stud> {
    int rollno;
    float marks;

    public stud(int rollno, float marks){
        this.rollno=rollno;
        this.marks=marks;

    }

    @Override
    public String toString() {
        return marks +" " ;
    }

    @Override
    public int compareTo(stud o) {
        System.out.println("in compare method");
        int diff=(int)(this.marks-o.marks);

        //if diff == 0:means both are equal
        //if diff < 0:means o is bigger ele o is smaller
        return diff;
    }
}
