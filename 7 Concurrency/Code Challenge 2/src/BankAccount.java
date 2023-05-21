public class BankAccount {
    private String name;
    private double debit;
    public BankAccount(String name,int debit){
        this.name=name;
        this.debit=debit;
    }
    public synchronized void withdraw(double amount){
        debit=debit-amount;
        longDatabaseCall();
    }
    public synchronized void deposit(double amount){
        debit=debit+amount;
        longDatabaseCall();
    }
    void longDatabaseCall(){
        try {
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public String toString()
    {
        return (name+" "+debit+"\n");
    }
}
