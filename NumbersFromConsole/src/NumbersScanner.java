import java.util.Scanner;

public class NumbersScanner {
    public int[] getNumbers()
    {
        Scanner scan = new Scanner(System.in);

        int n = 0;

        while(true)
        {
            System.out.print("Enter amount of numbers: ");
            try
            {
                String input = scan.next();
                n = Integer.parseInt(input);
                break;
            }
            catch(Exception e)
            {
                System.out.println("It is not a number!");
            }
        }

        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            while(true)
            {
                try
                {
                    System.out.print("Number" + (i+1) + ": ");
                    String input = scan.next();
                    arr[i] = Integer.parseInt(input);
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("It is not a number!");
                }
            }

        }
        scan.close();
        return arr;
    }
}

