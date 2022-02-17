import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputOutput {

 private static final String FILENAME = "C:\\Users\\Agarw\\OneDrive\\Desktop\\data.txt";

 public static void main(String[] args) {

  try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

   String c;

   while ((c = br.readLine()) != null) {
    System.out.println(c);
   }

  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
