import java.io.*;
public class copyfile {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Agarw\\OneDrive\\Desktop\\test.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }catch(Exception ex){
            return ;
        }
    }
}