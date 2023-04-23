public class Main {
    public static void main(String[] args) {
        int[] array={1,1,0,-1,-1};
        int n=array.length;
        int numberPairs=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
                if(array[i]==-1*array[j])
                {
                    for(int k=j;k< n-1;k++)
                        array[k]=array[k+1];
                    n--;
                    numberPairs++;
                    break;
                }
        }
        System.out.print(numberPairs);
    }
}