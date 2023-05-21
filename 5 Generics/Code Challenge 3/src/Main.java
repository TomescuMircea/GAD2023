import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String rootValue="a";
        GenericList<String> list=new GenericList<>(rootValue);
        for(int i=1;i<10;i++){
            list.insert(String.valueOf(Character.valueOf((char)(rootValue.charAt(0)+i))));
        }
        list.println();
    }
}