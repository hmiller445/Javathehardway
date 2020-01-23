import java.util.Scanner;

public class Blackjack
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int cardTotal = 0, compTotal, card, wager, total;
        String hit, again, win, loss;
        

        total = 0;
        do
        {
            cardTotal = 0;
            compTotal = 0;
            win = ("false");
            loss = ("false");
            System.out.print("How much do you want to bet: ");
            wager = keyboard.nextInt();
            
            System.out.println("Aight we playing blackjack.");
            card = 2 + (int)(Math.random()*9);
            System.out.print("You pulled a " + card);
            cardTotal += card;
            
            card = 2 + (int)(Math.random()*9);
            System.out.println(" and a " + card);
            cardTotal += card;
            
            System.out.println("Your total is " + cardTotal + "\n");
            System.out.println("Hit or stay:");
            hit = keyboard.next();

            while(hit.equals("hit"))
            {
                card = 2 + (int)(Math.random()*9);
                cardTotal += card;
                System.out.println("\nYou drew a " + card);
                System.out.println("Your total is " + cardTotal + "\n");
                if (cardTotal > 21)
                {
                    System.out.println("You went over, the Dealer wins");
                    hit = "stay";
                    win = ("false");
                    loss = ("true");
                    
                   
                }
                else if(cardTotal == 21)
                {
                    System.out.println("You win");
                    hit = "stay";
                    win = ("win");
                    loss = ("false");
                   
                   
                }
                else if(cardTotal < 21)
                {
                    System.out.println("Hit or Stay");
                    hit = keyboard.next();
                    win = ("false");
                    loss = ("false");
                }
            }
            if(loss.equals("false") && win.equals("false"))
            {
                hit = "hit";
                compTotal = 0;
                card = 0;

                card = 2 + (int)(Math.random()*9);
                System.out.println("\nThe dealer has a " + card +" and a hidden card");
                compTotal += card;

                card = 2 + (int)(Math.random()*9);
                System.out.println("The hidden card was a " + card);
                compTotal += card;
                System.out.println("The dealers total is " + compTotal + "\n");

                if(compTotal > 16)
                {
                    hit = "stay";
                }

                while(hit.equals("hit"))
                {
                    card = 2 + (int)(Math.random()*9);
                    compTotal += card;
                    System.out.println("Dealer drew a " + card);
                    System.out.println("Dealers total is " + compTotal+ "\n");

                    if(compTotal <= 16)
                    {
                        hit = "hit";
                    }
                    else
                    {
                        hit = "stay";
                    }

                }
                if(compTotal < cardTotal || compTotal > 21)
                {
                    System.out.println("You Win\nYou gained " + wager + "$");
                    win = ("win");
                }
                else if(compTotal > cardTotal || compTotal == cardTotal)
                {
                    System.out.println("Dealer Wins\nYou lost " + wager + "$");
                    win = ("false");
                    
                }
            }
            
            if(win.equals("win"))
            {
                total += wager;
                System.out.println("you guc");
            }
            if(win.equals("false"))
            {
                total -= wager;
            }
            wager = 0;
            System.out.println("Current total: " + total);
            System.out.println("Play again?");
            again = keyboard.next();
            
        }
        while(again.equals("yes"));
    }
}