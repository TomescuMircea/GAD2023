public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount from=new BankAccount("Ion",500);
        BankAccount to=new BankAccount("George",256);
        TransactionThread transfer=new TransactionThread("Transfer 1",from,to,50);
        transfer.start();
        transfer.sleep(5000);
        System.out.println(from);
        System.out.println(to);
    }
}