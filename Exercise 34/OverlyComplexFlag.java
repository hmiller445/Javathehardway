import static java.lang.System.*;

public class OverlyComplexFlag
{
    public static void main(String[] args)
    {
        printTopHalf();
        print480Colons();
        print480hs();
        print480Colons();
        print480hs();
        print480Colons();
        print480hs();

    }
    public static void print480Colons()
    {
        out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
    }
    public static void print480hs()
    {
        out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
    }
    public static void print29Colons()
    {
        out.println( "|:::::::::::::::::::::::::::::|");
    }
    public static void printPledge()
    {
        out.println( "I pledge allegiance to the flag." );
    }
    public static void print290hs()
    {
        out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
    }
    public static void print6Stars()
    {
        out.print( "| *  *  *  *  *  * " );
    }

    public static void print5Stars()
    {
        out.print( "|   *  *  *  *  *  " );
    }
    public static void printSixStarLine()
    {
        print6Stars();
        print290hs();
    }
    public static void printFiveStarLine()
    {
        print5Stars();
        print29Colons();
    }
    public static void printTopHalf()
    {
        out.println( " ________________________________________________" );
        printSixStarLine();
        printFiveStarLine();
        printSixStarLine();
        printFiveStarLine();
        printSixStarLine();
        printFiveStarLine();
    }
}