import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
public class problema {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map=new HashMap<String,String>();
        BufferedReader file=new BufferedReader(new FileReader("D:\\IntelliJey\\Code Challenge 1\\src\\in.txt"));
        String crtLine;

        while((crtLine=file.readLine())!=null)
        {
            //System.out.println(crtLine);
            StringTokenizer st = new StringTokenizer(crtLine);
            String name=st.nextToken();
            String phone=st.nextToken();
            map.put(name,phone);
        }
        System.out.println(map.get("Abbey"));
        System.out.println(map.get("Abdul"));
    }
}