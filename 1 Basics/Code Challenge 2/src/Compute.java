public class Compute {
    public static String compute(int number) {
        String message = new String("");
        if (number % 3 == 0)
            message = message + "Foo";
        if (number % 5 == 0)
            message = message + "Bar";
        if (number % 7 == 0)
            message = message + "Qix";
        int numberCopie = number;
        int oglindit = 0;
        while (numberCopie != 0) {
            oglindit = oglindit * 10 + numberCopie % 10;
            numberCopie = numberCopie / 10;
        }
        while (oglindit != 0) {
            if (oglindit % 10 == 3)
                message = message + "Foo";
            if (oglindit % 10 == 5)
                message = message + "Bar";
            if (oglindit % 10 == 7)
                message = message + "Qix";
            oglindit = oglindit / 10;
        }
        if(message.equals("")==true)
            message=Integer.toString(number);
        return message;
    }
}
