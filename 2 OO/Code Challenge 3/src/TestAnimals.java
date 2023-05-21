public class TestAnimals {
    public static void main(String args[]) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        a=c;
        a.walk();
        c.play();
        Animal[] array={new Spider(),new Cat(),new Fish()};
        array[2].walk();
    }
}
