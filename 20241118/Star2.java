import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++){
            // i가 행을 의미
            // 공백 = N - i 만큼 출력
            for(int j = 1 ; j<= N-i; j++){
                System.out.print(" ");
            }
            // 행의 개수 i 만큼 * 출력
            for(int k = 1 ; k <= i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
