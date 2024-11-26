import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotSendObject {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        //온 사람은 출석 체크
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }
        for (int i = 1; i <= 30; i++) {
            //불리지 않은 사람 출력
            if (!arr[i]) {
                System.out.println(i);  
            }
            
        }
    }
}
