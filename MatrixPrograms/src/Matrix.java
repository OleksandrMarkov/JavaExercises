import java.util.Scanner;

public class Matrix {
    int rows, columns;
    int [][] elements;

    public Matrix()
    {
        System.out.print("Please enter the rows in the matrix: ");
        Scanner sc = new Scanner(System.in);
        rows = Integer.valueOf(sc.next());
        System.out.print("Please enter the columns in the matrix: ");
        columns = Integer.valueOf(sc.next());
        sc.close();

        elements = new int [rows][columns];

        int min = 0, max = 1000;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                elements[i][j] = (int)(Math.random()*(max-min+1)+min);
            }
        }
    }

    public void showMatrix()
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(" " + elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}
