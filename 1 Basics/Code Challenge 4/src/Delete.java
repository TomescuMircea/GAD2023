public class Delete {
    public static void delete(int[] array,int poz)
    {
        for(int i=poz;i<array.length-1;i++)
            array[i]=array[i+1];
    }
}
