public class Table {
    public void showTable()
    {
        for(int i = 1; i < 11; i++)
        {
            for(int j = 1; j < 11; j++)
            {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println("\n");
        }
    }
}
