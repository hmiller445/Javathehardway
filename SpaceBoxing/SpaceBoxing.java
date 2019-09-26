import java.util.Scanner;

public class SpaceBoxing
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int weight, x;
        double conversion;

        System.out.print("Please enter your current earth weight: ");
        weight = keyboard.nextInt();

        System.out.println("I have information for the following planets: ");
        System.out.println("\t 1: Venus\t2. Mars\t 3. Jupiter");
        System.out.println("\t 4. Saturn\t5. Uranus\t 6. Neptune");
        System.out.print("Which planet are you visiting: ");
        x = keyboard.nextInt();
        
        if(x == 1)
        {
            conversion = weight * .78;
        }
        else if(x == 2)
        {
            conversion = weight * .39;
        }
        else if(x == 3)
        {
            conversion = weight * 2.65;
        }
        else if(x == 4)
        {
            conversion = weight * 1.17;
        }
        else if(x == 5)
        {
            conversion = weight * 1.05;
        }
        else if(x == 6)
        {
            conversion = weight * 1.23;
        }
        else
        {
            System.out.println("Type something right you troglotite");
            return;
        }
        System.out.println("Your weight would be " + conversion + " pounds on that planet");
    }
}