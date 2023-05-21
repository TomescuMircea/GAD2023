import java.lang.Thread;

public class Main{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2==0)
            {
                RabbitRunnable rabbit=new RabbitRunnable(i);
                (new Thread(rabbit)).start();
            }
            else {
                RabbitThread rabbit=new RabbitThread(i);
                rabbit.start();
            }
        }
    }
}