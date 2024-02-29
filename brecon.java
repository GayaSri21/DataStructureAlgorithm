package gaya;

public class brecon {
    public static void main(String args[]) {
        String[] names = {"Archana", "meeradevi", "gayathri", "Abilash"};
        for (String name : names) {  //for loop is must
            if (name.equals("gayathri")) {
                break;
            }
            System.out.println("break equals :" +name);
            }


        for( String name:names){

        if( name.equals("meeradevi")) {
            continue;
        }
        System.out.println("continue equals: "+name);
        }


        for (String name : names) {
            if (name.startsWith("A")) {
                break;
            }
            System.out.println("break startswith  :" +name);
        }


        for( String name:names){

            if( name.startsWith("A")) {
                continue;
            }
            System.out.println("continue startswith: "+name);
        }

    }
    }


