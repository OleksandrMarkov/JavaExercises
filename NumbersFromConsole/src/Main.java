public class Main {
    public static void main(String[] args)
    {
        NumbersScanner ns = new NumbersScanner();
        int [] arr = ns.getNumbers();

        EvenAndOddNumbers e = new EvenAndOddNumbers();
        e.getEvenAndOdd(arr);

        MinAndMax m = new MinAndMax();
        m.getminAndMax(arr);

        Dividers d = new Dividers();
        d.getDividers(arr);

        SortedNumbers sn = new SortedNumbers();
        sn.sortNumbers(arr);

        Palindromes p = new Palindromes();
        p.getPalindromes(arr);
        /*for(int i : arr){
            System.out.println(i);
        }*/
    }
}
