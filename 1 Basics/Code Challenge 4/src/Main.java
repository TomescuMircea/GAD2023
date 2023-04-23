public class Main {
    public static void main(String[] args) {
        int[] array={-1,-1,-1,2};
        int n= array.length;
        int numberPairs=0;
        int ok=1;
        for(int i=0;i<n-2;i++)
        {
            ok=1;
            for(int j=i+1;j<n-1 && ok==1;j++)
            {
                for(int k=j+1;k<n && ok==1;k++)
                    if(array[i]+array[j]+array[k]==0)
                    {
                        numberPairs++;
                        Delete.delete(array,k);
                        Delete.delete(array,j);
                        Delete.delete(array,i);
                        ok=0;
                    }
            }
        }
        System.out.print(numberPairs);

    }
}