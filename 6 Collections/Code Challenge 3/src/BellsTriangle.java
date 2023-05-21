import java.util.List;

public class BellsTriangle {
    public static void generate(int line)
    {
        int[][] matrix=new int[line][];
        matrix[0]=new int[1];
        matrix[0][0]=1;
        for(int i=1;i<line;i++)
        {
            matrix[i]=new int[i+1];
            matrix[i][0]=matrix[i-1][i-1];
            for(int j=1;j<=i;j++)
                matrix[i][j]=matrix[i][j-1]+matrix[i-1][j-1];
        }
        for(int i=0;i<line;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }








    }
}
