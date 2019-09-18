import java.util.Scanner;

public class BMICalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double i, p, m, kg, bmi;

        System.out.println("Your height in inches: ");
        i = keyboard.nextDouble();

        System.out.println("Your weight in pounds: ");
        p = keyboard.nextDouble();

        kg = p / 2.205;
        m = i / 39.37;
        bmi = kg / (m*m);

        System.out.println("Your BMI is " + bmi);
    }
}