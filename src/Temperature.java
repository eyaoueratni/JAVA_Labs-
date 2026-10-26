import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        //declare variables
        Double tFahrenheit ;
        Double tCelcius ;
        Scanner scan=new Scanner(System.in);
        //tell the user to input fahrenheit
        System.out.println("please insert a  temperature in fahrenheit =");
        //read in the temperature
        tFahrenheit=scan.nextDouble();

        //convert
        tCelcius=( (tFahrenheit -32)*5)/9;
        System.out.println("temperature in celius " + tCelcius);

    }

}
