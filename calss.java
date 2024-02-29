package gaya;


public class calss {
    public static void main(String[] args) {

        Lens lensone = new Lens("canon", "88mm", true); /*attributes*/

        Lens lenstwo = new Lens("nikon", "77mm", true);
        Lens lensthree = new Lens("sony", "44mm-66mm", false);

        System.out.println("lensone:");
        System.out.println(lensone.brand_name);
        System.out.println(lensone.focalLength);
        System.out.println(lensone.isPrime);
        System.out.println();

        System.out.println("lenstwo:");
        System.out.println(lenstwo.brand_name);
        System.out.println(lenstwo.focalLength);
        System.out.println(lenstwo.isPrime);
        System.out.println();

        System.out.println("lensthree:");
        System.out.println(lensthree.brand_name);
        System.out.println(lensthree.focalLength);
        System.out.println(lensthree.isPrime);
        System.out.println();


    }


    static class Lens {   /*class and properties*/
        String brand_name;
        String focalLength;
        boolean isPrime;

        Lens(String brand_name, String focalLength, boolean isPrime) { /*this portion is constructor passing the proporties*/
            this.brand_name = brand_name;
            this.focalLength=focalLength;
            this.isPrime = isPrime;





        }
    }
}
