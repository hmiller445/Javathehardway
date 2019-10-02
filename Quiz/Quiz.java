import java.util.Scanner;

public class Quiz
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int z, y, x, yes = 0;


        System.out.println("Answer the questions");

        System.out.println("Whats Obamas Last Name?\n\t1) Bohrak\n\t2) Care\n\t3) Bin Laden");
        z = keyboard.nextInt();
        if(z == 2)
        {
            yes++;
        }
        while(z != 2)
        {
            System.out.println("Try again golblin");
            System.out.println("\nWhats Obamas Last Name?\n\t1) Bohrak\n\t2) Care\n\t3) Bin Laden");
            z = keyboard.nextInt();
        }
        
        System.out.println("Why is David so dumb\n\t1) He is malnourished\n\t2) He is already dead\n\t3) Because");
        y = keyboard.nextInt();
        if(y == 3)
        {
            yes++;
        }
        while(y != 3)
        {
            System.out.println("Try again goblin");
            System.out.println("\nWhy is David so dumb\n\t1) He is malnourished\n\t2) He is already dead\n\t3) Because");
            y = keyboard.nextInt();
        }

        System.out.println("Yeah\n\t1) Okay\n\t2) No\n\t3) Yeah");
        x = keyboard.nextInt();
        if(x == 3)
        {
            yes++;
        }
        while(x != 3)
        {
            System.out.println("Try again goblin");
            System.out.println("Yeah\n\t1) Okay\n\t2) No\n\t3) Yeah");
            x = keyboard.nextInt();
        }

        System.out.println("Congrats, u got " + yes +"/3");

    }
}