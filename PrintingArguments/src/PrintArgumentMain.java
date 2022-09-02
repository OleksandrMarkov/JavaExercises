package src;

public class PrintArgumentMain {
    public static void main(String[]args)
    {
        /*for(String str:args)
        {
            System.out.printf("Argument--> %s%n", str);
        }
        */

        for (int i = 0; i < args.length; i++) {
            System.out.print("Argument--> " + args[i] + "\n");
        }

        System.out.println(args.length);
    }
}
