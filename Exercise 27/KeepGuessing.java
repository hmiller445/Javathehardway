import java.util.Scanner;

public class KeepGuessing
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(Math.random()*10);

        System.out.print("Guess between 1 and 10:");
        guess = keyboard.nextInt();

        while (secret != guess)
        {
            System.out.println("Wrong");
            System.out.print("Lol now we stuck in a loop");
        }

        System.out.println("Good guess");
    }
}
