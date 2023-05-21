public class Pair<T> {
    private Shoe first;
    private Shoe second;
    public Pair(Shoe firstElement, Shoe secondElement){

        if(firstElement.getClass()!=secondElement.getClass() || firstElement.getColor()!=secondElement.getColor() || firstElement.getSize()!=secondElement.getSize())
        {
            System.out.println("Different shoes!");
        }
        else
        {
            first=firstElement;
            second=secondElement;
        }



    }
    public Object getFirst(){return first;}
    public Object getSecond(){return second;}
}
