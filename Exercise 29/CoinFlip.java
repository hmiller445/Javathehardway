import java.util.Scanner;

public class CoinFlip
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String coin, again;

        int streak = 0;
        boolean gotHeads;

        do
        {
            gotHeads = Math.random() < .5;

            if ( gotHeads)
            {
                coin = "Heads";
                
            }
            else
            {
                coin = "tails";
            }

            System.out.println("You flip a coin, it lands on " + coin);

            if(gotHeads)
            {
                streak++;
                System.out.println("That's " + streak + " in a row... ");
                System.out.println("Would you like to flip again (y/n)");
                again = keyboard.next();
            }
            else
            {
                System.out.println("You lost everything, shoulda quit while aHead");
                streak = 0;
                again = "n";
            }
                 
        } while (again.equals("y"));

        System.out.println("Final score: " + streak);
    }
}