import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello,\tworld!!\n\n ");
        System.out.println("Nice to meet you !!!");
        ///this output a line

        System.out.println();
        // this is a line comment
        System.out.println("It's a beautiful day. " + "Lots of sun today...");

        System.out.println("1 + 2 = " + (1+2));
        //output a name
        String name="stetter";
        //output some text using this variable
        System.out.println("hello Mr." + name +"!");
        // create a new object of the API-class Scanner connected to the basic input System.in
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = scan.next();
        System.out.println("Hello Mrs. " + name);
    }
}
