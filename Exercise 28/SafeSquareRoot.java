import java.util.Scanner;

public class SafeSquareRoot
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double x,y;

        System.out.println("Gib number, i giv square root, no negatives");
        x = keyboard.nextDouble();

        while(x < 0)
        {
            System.out.println("Bruh");
            x = keyboard.nextDouble();
        }

        y = Math.sqrt(x);

        System.out.println("Square root of " + x + " is " + y );
    }
}