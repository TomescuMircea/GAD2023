public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void read(Publication article) {
        System.out.println(name + " citeste noul articol: " + article);
    }

}
