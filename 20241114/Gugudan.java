import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan {
    public static void main(String[]args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(br.readLine());
        for( int j = 1; j < 10; j++){
                    System.out.println(a + " * " + j + " = " + a * j);
        }
    }    
}
