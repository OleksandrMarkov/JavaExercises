import java.util.ArrayList;
import java.util.Arrays;

public class EvenAndOddNumbers {
    public void getEvenAndOdd(int[] arr)
    {
        // print even and odd numbers
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>(); // %2 == 1

        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0) even.add(arr[i]);
            else odd.add(arr[i]);
        }

        System.out.println("\nEven numbers: ");
        /*for(int i : even){
            System.out.print(i + " ");
        }*/
        System.out.println(Arrays.deepToString(even.toArray()));

        System.out.println("\nOdd numbers: ");
        /*for(int i : odd){
            System.out.print(i + " ");
        }*/
        System.out.println(Arrays.deepToString(odd.toArray()));
    }
}
