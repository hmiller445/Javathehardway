import java.util.Scanner;

public class RunningTotal
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int current, total = 0;
        System.out.println("Type a bunch of values, ill add them up");
        System.out.println("I'll stop when you type 0");

        do
        {
            System.out.print("Value: ");
            current = keyboard.nextInt();
            total += current;
            System.out.println("Current total: " + total);
        }
        while (current != 0);
        System.out.println("Final total is: " + total);
    }
}