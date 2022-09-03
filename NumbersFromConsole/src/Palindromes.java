import java.util.ArrayList;
import java.util.Arrays;

public class Palindromes {
    public void getPalindromes(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i : arr)
        {
            if(i > 0)
            {
                String num = String.valueOf(i);
                String reverse = "";
                int len = num.length();

                for(int j = len - 1; j >= 0; j--)
                {
                    reverse += num.charAt(j);
                }

                if (i == Integer.parseInt(reverse))
                {
                    list.add(i);
                }
            }
        }
        System.out.println("\nThere are " + list.size() + " palindromes.");
        System.out.println(Arrays.deepToString(list.toArray()));
    }
}
