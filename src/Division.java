// <necessary imports>

import java.util.Scanner;

/**
 * What task is to be solved by this class?
 *
 * <Autor>
 * <Date>
 */
public class Division {

    /**
     * main method:
     * What task is to be solved by this method?
     * input:
     * output:
     */
    public static void main(String[] arg) {

        // declare variables

        // implement the designed sub tasks
        int x ;
        Scanner scan=new Scanner(System.in);
        //tell the user to input fahrenheit
        System.out.println("please insert a number =");
        x=scan.nextInt();
        /***
         * if the number is divisible by 2
         */
        /*
        if ( x % 2 == 0)
        {
            System.out.println("the number" +x+ " is divisible by 2 ");
        }
        else
        { System.out.println("the number" +x+ " is not divisible by 2 "); }
        ***/
        /**
         * decide if the number divisible par 2 or 3
         *
         */
        if ( x % 2 == 0) {
            if (x % 3 == 0) {
                System.out.println("the number" + x + " is divisible by 2 and 3");
            } else {
                System.out.println("the number" + x + " is divisible by 2 ,not by 3");

            } }
        else{
                if (x % 3 == 0) {
                    System.out.println("the number" + x + " is divisible not by 2 but by3");
                } else {
                    System.out.println("the number" + x + " is divisible by 2 ,nor 3");
                }
            }
            //scan.close();

        }
}