package gaya.enummain;

public class enumma {  //abstructs are not allowed in enum but method body is require inside the body
    enum week implements greet { //you can use implement over here
        // you cannot use extend on enum that means you cant extend anything enum cant be superclass
        sun, mon, tue, wed, thu, fri, sat;
        //these are enum constants
        //public , static and final
        //since its final you can create child enums
        //type is week


        week() {
            System.out.println("im in constructor" + " " + this);
        }

        @Override
        public void greetings() {
            System.out.println("hey");
        }


        //this is cannot be public or protected but only private or default
        //why? we dont want to create any extra objects like mon, tue  etc if it was public or protected then, it will allow initialization of the more than one objects i.e mon,tue etc)
        //this is not the enum concept that's why
        //internally the process like:public static final week mon=new week();
    }

    public static void main(String[] args) {
        week Week = week.tue;

        Week.greetings();
        System.out.println(Week.ordinal());
        System.out.println(week.valueOf("mon"));
        for(week days : week.values())
           System.out.println(days);
    }
    }

