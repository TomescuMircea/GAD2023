public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Walking with " + legs + " legs");
    }

    public abstract void eat();
}
