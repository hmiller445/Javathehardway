import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CoinFlipSaved
{
    public static void main(String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        String coin, again, bestName, saveFileName = "coin-flip-score.txt";
        int streak = 0, best;
        boolean gotHeads;

        File f = new File(saveFileName);
        if (f.exists() && f.length() > 0)
        {
            Scanner input = new Scanner(f);
                bestName = input.next();
                best = input.nextInt();
            input.close();
            System.out.print("High Score is " + best);
            System.out.println(" flips in a row by " + bestName);
        }
        else 
        {
            System.out.println("Save game file doesn't exist or is empty");
            best = -1;
            bestName = "";

        }

        do
        {
            gotHeads = Math.random() < 0.5;

            if(gotHeads)
            {
                coin = "HEADS";
            }
            else
            {
                coin = "TAILS";
            }

            System.out.println("You filp a coin and it lands on " + coin);

            if(gotHeads)
            {
                streak++;
                System.out.println("Thats " + streak + " in a row.");
                System.out.println("Would you like to flip again?(y/n)");
                again = keyboard.next();

            }
            else
            {
                streak = 0;
                again = "n";

            }
        }
        while(again.equals("y"));

        System.out.println("Final score: " + streak);

        if(streak > best)
        {
            System.out.println("Thats a new high score.");
            System.out.print("Your Name: ");
            bestName = keyboard.next();
            best = streak;
        }
        else if(streak == best)
        {
            System.out.println("That ties the high score.");
       }
       else
       {
           System.out.print("DO BETTER");
           System.out.print(streak + " if you want high score");
       }

       //saves high score and name to file
       PrintWriter out = new PrintWriter(f);
            out.println(bestName);
            out.println(best);
        out.close();
    } 
}