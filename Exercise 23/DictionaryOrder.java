import java.util.Scanner;

public class DictionaryOrder
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.print("Make up the name of a programming language! ");
        name = keyboard.next();

        if(name.compareTo("c++") < 0)
            System.out.println(name + " comes before c++");
        if(name.compareTo("c++")== 0)
            System.out.println(name + " isnt a made up language");
        if(name.compareTo("c++") > 0)
            System.out.println(name + " comes after c++");

        if(name.compareTo("go") < 0)
            System.out.println(name + " comes after go");
        if(name.compareTo("go")== 0)
            System.out.println(name + " isnt a made up language");
        if(name.compareTo("go") > 0)
            System.out.println(name + " comes after go");
            
        if(name.compareTo("java") < 0)
            System.out.println(name + " comes before java");
        if(name.compareTo("java")== 0)
            System.out.println(name + " isnt a made up language");
        if(name.compareTo("java") > 0)
            System.out.println(name + " comes after java");

        if(name.compareTo("lisp") < 0)
            System.out.println(name + " comes before lisp");
        if(name.compareTo("lisp")== 0)
            System.out.println(name + " isnt a made up language");
        if(name.compareTo("lisp") > 0)
            System.out.println(name + " comes after lisp");

        if(name.compareTo("python") < 0)
            System.out.println(name + " comes before python");
        if(name.compareTo("python")== 0)
            System.out.println(name + " isnt a made up python");
        if(name.compareTo("python") > 0)
            System.out.println(name + " comes after python");

        if(name.compareTo("ruby") < 0)
            System.out.println(name + " comes before ruby");
        if(name.compareTo("ruby")== 0)
            System.out.println(name + " isnt a made up language");
        if(name.compareTo("ruby") > 0)
            System.out.println(name + " comes after ruby");

        if(name.compareTo("visualbasic") < 0)
            System.out.println(name + " comes before visualbasic");
        if(name.compareTo("visualbasic")== 0)
            System.out.println(name + " isnt a made up language");
        if(name.compareTo("visualbasic") > 0)
            System.out.println(name + " comes after visualbasic");

        
    }
}