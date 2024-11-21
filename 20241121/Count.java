import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Count {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        
        // 정수의 개수
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 찾으려고 하는 정수 v개수
        int count = 0;
        // 찾으려고 하는 정수 v
        int v = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
           if(Integer.parseInt(st.nextToken()) == v){
            count++;
           }
        
        }
           System.out.println(count);
    }
    
}   
