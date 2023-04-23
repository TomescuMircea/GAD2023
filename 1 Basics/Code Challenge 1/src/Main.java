public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0)
                    System.out.printf("Fizz");
                if (i % 5 == 0)
                    System.out.printf("Buzz");
            } else if (i % 7 == 0)
                System.out.printf("Rizz");
            else if (i % 11 == 0)
                System.out.printf("Jazz");
            else System.out.printf("%d", i);
            System.out.printf(",");
        }
    }
}