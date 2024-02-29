package gaya;

public class marklist {
    public static void main(String[] args) {
        Mlist refvaria = new Mlist();
        System.out.println(refvaria.name);

        Mlist Mlistone=new Mlist("gaya",9,72.25);
        Mlist Mlisttwo=new Mlist("abhilash",1,99);
        Mlist Mlistthree=new Mlist("tamilinie",44,100);
        Mlist var = new Mlist(); /* one and two in stack memory contains same value in heap memory i.e "ff" */
        Mlist var1 = var;
        var1.name="ff";
        System.out.println(var.name);
        System.out.println("student name: " +Mlistone.name);
        System.out.println("Roll number: "+Mlistone.roll);
        System.out.println("Marks: "+Mlistone.marks);
        System.out.println();
        System.out.println(Mlisttwo.name);
        System.out.println(Mlisttwo.roll);
        System.out.println(Mlisttwo.marks);
        System.out.println();
        System.out.println(Mlistthree.name);
        System.out.println(Mlistthree.roll);
        System.out.println(Mlistthree.marks);



    }
        static class Mlist {


            String name;
            int roll;
            double marks;

            Mlist(String name,int roll,double marks){

                this.marks=marks;
                this.name=name;
                this.roll=roll;
            }

            Mlist(){
                // calling constructor from another constructor, ref variable is refvaria
                this("far",8,89);
            }








            }


        }


