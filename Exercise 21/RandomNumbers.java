public class RandomNumbers
{
    public static void main(String[] args)
    {
        int a, b, c, d;
        double r, rps;

        rps = Math.random();
        if(rps < 0.3333333)
        {
            System.out.println("ROCK");
        }
        else if(rps < .66666667)
        {
            System.out.println("PAPAER");
        }
        else
        {
            System.out.println("SCISSORS");
        }

        a = 1 + (int)(10*Math.random());
        b = 1 + (int)(10*Math.random());
        c = 1 + (int)(10*Math.random());
        d = 1 + (int)(10*Math.random());
        System.out.println("1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d);
        a = 1 + (int)(6*Math.random());
        b = 1 + (int)(6*Math.random());
        c = 1 + (int)(6*Math.random());
        d = 1 + (int)(6*Math.random());
        System.out.println("1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d); 

    }
}