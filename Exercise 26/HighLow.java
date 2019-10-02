import java.util.Scanner;

public class HighLow
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(100*Math.random());
        System.out.println("1-100");
        System.out.println("Try to guess");
        System.out.print("> ");
        guess = keyboard.nextInt();

        while(secret != guess)
        {
            if(guess < secret)
            {
                System.out.println("Too low, Try again");
                guess = keyboard.nextInt();
            }
            if(guess > secret)
            {
                System.out.println("Too high, Try again");
                guess = keyboard.nextInt();
            }
        }

        System.out.println("Noice");
    }
}