public class TransactionThread extends Thread{
    private String name;
    private BankAccount from,to;
    private int amount;
    public TransactionThread(String name,BankAccount from,BankAccount to,int amount){
        this.name=name;
        this.from=from;
        this.to=to;
        this.amount=amount;
    }
    @Override
    public void run(){
        System.out.println("Transaction started");
        transfer(from,to,amount);
        System.out.println("Transaction ended");
    }
    private void transfer(BankAccount from,BankAccount to,int amount){
        from.withdraw(amount);
        to.deposit(amount);
    }
}
