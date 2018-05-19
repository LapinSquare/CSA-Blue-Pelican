import java.util.Scanner;

/** 
 * Displaying numbers. 
 * @author Kim Huynh 
 * @version 11/10/2017 
 */ 

public class CountingFor 
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it ten times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 10 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }

    }
}
