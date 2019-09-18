import java.util.Scanner;

public class RudeQuestions
{
    public static void main (String[] args)
    {
        String name, gay;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello. What is your name");
        name = keyboard.next();

        System.out.println("Hi " + name + "! How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ". eh? Thats not very old.");
        System.out.println("How much do you weigh, " + name + "?");
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Better keep that quiet!!");
        System.out.println("Finally, whats your income" + name + "?");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is " + income + " per hour ");
        System.out.println("and not per year");
        System.out.print("Well, pee pee poo poo ");
        System.out.println(name + ".");

        System.out.println("Why are you gay " + name + "?");
        keyboard.next();
    }
}
//does not blow up
//does not blow up
//spaces in name, strings in int and double.