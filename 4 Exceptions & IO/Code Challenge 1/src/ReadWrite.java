
import java.io.*;
public class ReadWrite {
    public String readLine()
    {
        String line = null;
        try{
            BufferedReader bf=new BufferedReader(new FileReader("D:\\IntelliJey\\Code Challenge 1\\src\\in.txt"));
            line=bf.readLine();
        }catch(Exception e){
            e.printStackTrace();
        }
        return line;
    }

}
