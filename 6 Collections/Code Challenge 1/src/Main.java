import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(2, 4, 77, 5, 2, 9, 0, 4));
        Integer curentMax = list.get(list.size() - 1);
        System.out.println(curentMax);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (curentMax < list.get(i)) {
                curentMax = list.get(i);
                System.out.println(curentMax);
            }
        }
    }
}
