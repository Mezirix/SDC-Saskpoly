package MidTerm;

import java.util.Random;

public class MyRandomNum
{
    public static void main(String[] args) {
//        int min = 0;
//        int max = 0;
//        System.out.println("Random value from" +min+  "to"  +max+ ":");
//
//        int random_int = (int)Math.floor(Math.random()* (max - min ) + min);
//        System.out.println(random_int);

        Random rand = new Random();
        int upperbound;

//        rand.nextInt
        int int_random = rand.nextInt();

        double double_random = rand.nextDouble();

        float float_random = rand.nextFloat();

        System.out.println("Random integer value from 0 to"  +int_random);

    }
}
