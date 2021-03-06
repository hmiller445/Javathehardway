import java.util.Scanner;
 
public class PigDice
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int roll, ptot, ctot, turnTotal;
        String choice = "";

        ptot = 0;
        ctot = 0;

        do
        {
            turnTotal = 0;
            System.out.println("You have " + ptot + " points");

            do
            {
                roll = 1 + (int)(Math.random()*6);
                System.out.println("You rolled a " + roll);
                if(roll == 1)
                {
                    System.out.println("That ends your turn");
                    turnTotal = 0;
                }
                else
                {
                    turnTotal += roll;
                    System.out.println("You have " + turnTotal + " points so far this round."); 
                    System.out.println("\"roll\" again or \"hold\".");
                    choice = keyboard.next();
                }
            } 
            while (roll != 1 && choice.equals("roll"));

            ptot += turnTotal;
            System.out.println("You end the round with " + ptot + " points.");

            if (ptot < 100)
            {
                turnTotal = 0;
                System.out.println("Computer has " + ctot + " points.");

                do
                {
                    roll = 1 + (int)(Math.random()*6);
                    System.out.println("\tComputer rolled a " + roll + ".");
                    if (roll == 1)
                    {
                        System.out.println("That ends its turn.");
                        turnTotal = 0;
                    }
                    else
                    {
                        turnTotal += roll;
                        System.out.println("Computer has " + turnTotal + "  points this round.");
                        if(turnTotal < 20)
                        {
                            System.out.println("Computer will roll again.");
                        }
                    }
                }
                while (roll != 1 && turnTotal < 20);

                ctot += turnTotal;
                System.out.println("Computer ends the round with " + ctot + " points.");
            }
        }
        while (ptot < 100 && ctot < 100);
        if (ptot > ctot)
        {
            System.out.println("U win");
        }
        else
        {
            System.out.println("U lost lol");
        }

    }
}