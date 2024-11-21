import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SmallthenX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫쨰줄 입력
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());

        // 둘쨰줄 입력
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        // 문자열 출력
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            int value = Integer.parseInt((st2.nextToken()));
            if(value < X ){
                sb.append(value).append(' ');
            }
        }
        System.out.println(sb);
    }
}
