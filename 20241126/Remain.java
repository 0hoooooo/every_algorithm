import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remain {
     public static void main(String[] args) throws IOException {
 
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 나머지가 될수 있는 값인 0~41 크기로 배열 선언
        boolean[] arr = new boolean[42];
        
        //수 10개를 입력
        for(int i = 0 ; i < 10 ; i++) {
             int n = Integer.parseInt(br.readLine());
             // 입력받은 값을 42로 나눴을때 나머지 값의 index를 true로 변경
             arr[n % 42] = true;
        }
        
        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
    }
}
