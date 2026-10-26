import java.util.Random;
import java.text.DecimalFormat;

/**
 * Example program using the for statement
 *
 * Claudia Brand
 * 20.10.2025
 */
public class ForExamples {

    /**
     * main-Method:
     * implements examples using the for statement
     */
    public static void main (String[] args) {

        // the Babbage-Function
        System.out.println("The first values of the Babbage function");
        for (int x = 0; x < 10; x++) {
            int y = x*x + x + 41;
            System.out.println( "\t" + x + "\t" + y);
        }

        // Example of a counter controlled loop: sum of 5 random numbers
        System.out.println("\nThe sum of 5 random numbers:");
        Random rand = new Random();
        double sum = 0;
        for (int i=0; i<5; i++) {
            double number = rand.nextDouble();
            sum += number;
            System.out.println("Number: " + number + "\tSum: " + sum);
        }

        // Limitation to a certain number of decimal places
        DecimalFormat decimalFormat =  new DecimalFormat("#.####");
        double z = rand.nextDouble();
        String zFormat = decimalFormat.format(z);
        System.out.println("\nRandom number: " + zFormat);

        // or like this:
        double scale = 10000;
        double zScaled = Math.round(z*scale)/scale;
        System.out.println("Random number: " + zScaled);

    }
}