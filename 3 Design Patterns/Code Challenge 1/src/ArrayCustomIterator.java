public class ArrayCustomIterator {
    private int position;
    private int[] array;
    public ArrayCustomIterator(int[] newArray)
    {
        this.array=new int[newArray.length];
        for(int i=0;i< newArray.length;i++)
            array[i]=newArray[i];
    }
    public boolean hasNext()
    {
        if(position< array.length)
            return true;
        else return false;
    }
    public int next()
    {
        position++;
        return array[position-1];
    }
}
