// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car masina0=new Car.Builder("BMW","M3","red","V6").setNoSeats(5).setSpeed(190).buildCar();

        System.out.println(masina0);

        Car masina1=new Car.Builder("Mercedes","C class","black","4 in line").setNoSeats(5).setSpeed(160).buildCar();

        System.out.println(masina1);
    }
}