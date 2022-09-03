import java.util.Arrays;
import java.util.Collections;

public class SortedNumbers {
    public void sortNumbers(int[] arr)
    {
        Arrays.sort(arr);
        System.out.println("\nSorting in an ascending order:");
        System.out.println(Arrays.toString(arr));

        Integer[] newArr = new Integer[arr.length];
        int i = 0;
        for (int value : arr) {
            newArr[i++] = Integer.valueOf(value);
        }

        Arrays.sort(newArr, Collections.reverseOrder());
        System.out.println("\nSorting in an descending order:");
        System.out.println(Arrays.toString(newArr));
    }
}
