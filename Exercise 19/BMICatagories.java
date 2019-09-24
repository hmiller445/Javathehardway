import java.util.Scanner;

public class BMICatagories
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double bmi;

        System.out.print("Enter your BMI: ");
        bmi = keyboard.nextDouble();

        System.out.print("BMI Catagory: ");
        if (bmi < 15)
        {
            System.out.println("spooky scary skeletons");
        }
        else if(bmi <= 16)
        {
            System.out.println("rattle me bones");
        }
        else if(bmi < 18.5)
        {
            System.out.println("underweight");
        }
        else if(bmi < 25)
        {
            System.out.println("normal weight");
        }
        else if(bmi < 30)
        {
            System.out.println("moderately obese");
        }
        else if(bmi < 40)
        {
            System.out.println("oh lawd he comin");
        }
        else
        {
            System.out.println("C H O N K");
        }


    }
}