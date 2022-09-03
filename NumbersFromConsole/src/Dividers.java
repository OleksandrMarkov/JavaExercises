import java.util.ArrayList;
import java.util.Arrays;

public class Dividers {
    public void getDividers(int[] arr)
    {
        ArrayList<Integer> ThreeAndNineDividers= new ArrayList<Integer>();
        ArrayList<Integer> FiveOrSevenDividers= new ArrayList<Integer>();

        for (int i: arr)
        {
            if ((i%3) == 0 && (i%9) == 0)
            {
                ThreeAndNineDividers.add(i);
            }
            if ((i%5) == 0 || (i%7) == 0) {
                FiveOrSevenDividers.add(i);
            }
        }

        System.out.println("\nThree and nine dividers: ");
        System.out.println(Arrays.deepToString(ThreeAndNineDividers.toArray()));
        System.out.println("\nFive or seven dividers: ");
        System.out.println(Arrays.deepToString(FiveOrSevenDividers.toArray()));
    }
}
