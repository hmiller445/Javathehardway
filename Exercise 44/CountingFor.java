import java.util.Scanner;

public class CountingFor
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n;
        String message;

        System.out.println("Enter a Message and I'll display it five times");
        System.out.print("Message: ");
        message = keyboard.nextLine();

        for(n = 1 ; n <= 5 ; n++)
        {
            System.out.println(n + " " + message);
        }
        System.out.println("Now I'll show it ten times counting by fives,");
        for(n = 5 ; n <= 50 ; n += 5)
        {
            System.out.println(n + " " + message);
        }
        System.out.println("Now three times counting backward.");
        for(n = 3 ; n > 0 ; n--)
        {
            System.out.println(n + " " + message);
        }
    }
}