public class Currency {
    private float value;
    private String name;
    public Currency(String name, float value){
        this.name=name;
        this.value=value;
    }

    public float getValue()
    {
       return this.value;
    }

    public String toString(){
        return "Curency" + name + "Value" + value;
    }
}
