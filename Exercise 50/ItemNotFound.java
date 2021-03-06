import java.util.Scanner;

public class ItemNotFound
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String[] heroes = {
            "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
            "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
            "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
            "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
        };

        String guess;
        boolean found;

        System.out.println("Pop Quiz!");
        System.out.print("Name any *mortal* hero from Greek Mythology: ");
        guess = keyboard.next();
        found = false;
        for(String hero : heroes)
        {
            if(guess.equals(hero))
            {
                System.out.println("Correct");
                found = true;
            }
        }

        if(found == false)
        {
            System.out.println("No, " + guess + " wasn't a mortal Greek hero.");
        }
    }
}