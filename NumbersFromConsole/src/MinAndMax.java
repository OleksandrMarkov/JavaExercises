import java.util.Arrays;

public class MinAndMax {
    public void getminAndMax(int[] arr)
    {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("\nMin value: " + min );
        System.out.println("\nMax value: " + max );
    }
}
