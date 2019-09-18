import java.util.Scanner;

public class ForgetfulMachine
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of France?");
        keyboard.next();

        System.out.println("What is 6 * 7?");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 1.0");
        keyboard.nextDouble();

        System.out.println(" Is there anything else you would like to say? ");
        keyboard.next();
    }
}

//typing a letter or decimal blows up the program on question 2
//typing a letter blows up question 3
