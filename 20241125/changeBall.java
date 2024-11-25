import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class changeBall {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // N개의 바구니
        int N = Integer.parseInt(st.nextToken());
        // 공 교환 횟수
        int M = Integer.parseInt(st.nextToken());

        // N 크기의 바구니 배열 선언 & 초기화
        int[] arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        // M 번 교환 
        for (int i = 0; i < M; i++) {
            // 임시변수
            int tmp;
            st = new StringTokenizer(br.readLine(), " ");
            int F = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            tmp = arr[F];
            arr[F] = arr[E];
            arr[E] = tmp;
        }
        br.close();

        for( int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
