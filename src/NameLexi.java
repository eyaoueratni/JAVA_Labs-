import java.util.Scanner ;
/**
 * What task is to be solved by this class?
 * sort three name
 * <Autor>
 * <Date>
 */
public class NameLexi {

    /**
     * main method:
     * What task is to be solved by this method?
     * input:
     * output:
     */
    public static void main(String[] arg) {

        // declare variables
        String n1,n2,n3 ;
        //read the names
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Please input name 1 :");
        n1=scan.next();
        System.out.println("Please input name 2 :");
        n2=scan.next();
        System.out.println("Please input name 3 :");
        n3=scan.next();


        System.out.println("name sorted :");
        if ( n1.compareTo(n2) < 0){
           if (n2.compareTo(n3) < 0)
           {  System.out.println( n1 +" " + n2 +" " + n3 );
           }
        }else {
            if (n1.compareTo(n3 )< 0) {
            System.out.println( n1 +" " + n3 +" " + n2 );
        } else {
                System.out.println( n3 +" " + n1 +" " + n2 );
            }
        }

    }}