import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenWatch {
    // 알람 시계 문제의 반대
    // A(시)와 B(분)을 하나의 분으로 변환한 뒤, 
    // C를 더하고 나온 결과 값을 다시 시와 분 으로 변환하는 방법

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());
        
        // A(시)와 B(분)을 하나의 분으로 변환한 뒤, 
        int min = 60 * A + B;
        min += C;
        
        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
