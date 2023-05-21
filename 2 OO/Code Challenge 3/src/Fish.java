public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
        name = "";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + "is playing");
    }

    @Override
    public void walk() {
        System.out.println("can't walk and  don't have legs");
        super.walk();
    }

    @Override
    public void eat() {
        System.out.println("The " + name + " is eating");
    }


}
