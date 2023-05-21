import java.lang.reflect.InvocationTargetException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RON leu=new RON(200f);
        ExchangeDesk exchangeDesk=new ExchangeDesk();
        try{
            System.out.println(exchangeDesk.convert(leu,USD.class));
            System.out.println(exchangeDesk.convert(leu,USD.class,0.25f));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}