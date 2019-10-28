import java.util.Scanner;
import java.util.Random;

public class Monte
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int guess, card, cups = 0;
        String under;
        Random r = new Random();

        System.out.println("Pick the ace:");

        System.out.println("## ## ##\n## ## ##\n1  2  3");
        guess = keyboard.nextInt();

        card = 1 + r.nextInt(3);

        if(guess == card)
        {
            System.out.println("Ya did it");
        }
        if(guess != card)
        {
            System.out.println("Ya done goofed");
        }
        while (cups < 3)
        {
            cups++;
            if(cups == card)
            {
                under = "AA";
            }
            else
            {
                under = "##";
            }
            System.out.print(under + " ");
                       
        }
        System.out.println();
        cups = 0;
        while (cups < 3)
        {
            cups++;
            if(cups == card)
            {
                under = "AA";
            }
            else
            {
                under = "##";
            }
            System.out.print(under + " ");
                       
        }

        System.out.println("\n1  2  3");
        
    }
}