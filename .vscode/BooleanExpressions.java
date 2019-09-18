import java.util.Scanner;

public class BooleanExpressions
{
    public static void main(String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        boolean a, b, c, d, e, f;
        double x, y;

        System.out.println("Give me two numbers. First: ")
        x = keyboard.nextDouble();
        System.out.println("Next: ");
        y = keyboard.nextDouble();

        a = (x <  y);
        b = (x <= y);
        c = (x == y);
        d = (x != y);



    }
}