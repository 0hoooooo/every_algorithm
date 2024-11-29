import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiCode {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String st = br.readLine();
       br.close();
       int n = (int)st.charAt(0);
       System.out.println(n);
   } 
}
