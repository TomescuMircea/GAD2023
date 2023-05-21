public class ArrayIterator<T> implements  IArrayIterator<T>{
    private T[] arr;
    private int position;
    public ArrayIterator(T[] arr){
        this.arr=arr;
        this.position=0;
    }
    @Override
    public boolean hasNext() {
        if(position<arr.length)
            return true;
        else return false;
    }

    @Override
    public T next() {
        return arr[position++];
    }
}
